/*
 * Copyright 2010-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.resolve.scopes

import com.intellij.util.SmartList
import org.jetbrains.kotlin.descriptors.*
import org.jetbrains.kotlin.incremental.components.LookupLocation
import org.jetbrains.kotlin.name.Name
import org.jetbrains.kotlin.resolve.scopes.utils.takeSnapshot
import org.jetbrains.kotlin.utils.Printer

class LexicalWritableScope(
        parent: LexicalScope,
        override val ownerDescriptor: DeclarationDescriptor,
        override val isOwnerDescriptorAccessibleByLabel: Boolean,
        override val implicitReceiver: ReceiverParameterDescriptor?,
        override val redeclarationHandler: RedeclarationHandler,
        private val debugName: String
) : LexicalScope, WritableScopeStorage {
    public enum class LockLevel {
        WRITING,
        BOTH,
        READING
    }

    override val parent = parent.takeSnapshot()
    override val addedDescriptors: MutableList<DeclarationDescriptor> = SmartList()

    override var functionsByName: MutableMap<Name, WritableScopeStorage.IntList>? = null
    override var variablesAndClassifiersByName: MutableMap<Name, WritableScopeStorage.IntList>? = null

    private var lockLevel: LockLevel = LockLevel.WRITING
    private var lastSnapshot: Snapshot? = null

    public fun changeLockLevel(lockLevel: LockLevel) {
        if (lockLevel.ordinal() < this.lockLevel.ordinal()) {
            throw IllegalStateException("cannot lower lock level from " + this.lockLevel + " to " + lockLevel + " at " + toString())
        }
        this.lockLevel = lockLevel
    }

    public fun takeSnapshot(): LexicalScope {
        checkMayRead()
        if (lastSnapshot == null || lastSnapshot!!.descriptorLimit != addedDescriptors.size()) {
            lastSnapshot = Snapshot(addedDescriptors.size())
        }
        return lastSnapshot!!
    }

    public fun addVariableDescriptor(variableDescriptor: VariableDescriptor) {
        checkMayWrite()
        addVariableOrClassDescriptor(variableDescriptor)
    }

    public override fun addFunctionDescriptor(functionDescriptor: FunctionDescriptor) {
        checkMayWrite()
        super<WritableScopeStorage>.addFunctionDescriptor(functionDescriptor)
    }

    public fun addClassifierDescriptor(classifierDescriptor: ClassifierDescriptor) {
        checkMayWrite()
        addVariableOrClassDescriptor(classifierDescriptor)
    }

    override fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean)
            = checkMayRead().addedDescriptors

    override fun getContributedClassifier(name: Name, location: LookupLocation) = checkMayRead().getDeclaredClassifier(name)

    override fun getContributedVariables(name: Name, location: LookupLocation) = checkMayRead().getDeclaredVariables(name)

    override fun getContributedFunctions(name: Name, location: LookupLocation) = checkMayRead().getDeclaredFunctions(name)

    private fun checkMayRead(): LexicalWritableScope {
        if (lockLevel != LockLevel.READING && lockLevel != LockLevel.BOTH) {
            throw IllegalStateException("cannot read with lock level " + lockLevel + " at " + toString())
        }
        return this
    }

    private fun checkMayWrite() {
        if (lockLevel != LockLevel.WRITING && lockLevel != LockLevel.BOTH) {
            throw IllegalStateException("cannot write with lock level " + lockLevel + " at " + toString())
        }
    }

    private inner class Snapshot(val descriptorLimit: Int) : LexicalScope {
        override val parent: LexicalScope?
            get() = this@LexicalWritableScope.parent
        override val ownerDescriptor: DeclarationDescriptor
            get() = this@LexicalWritableScope.ownerDescriptor
        override val isOwnerDescriptorAccessibleByLabel: Boolean
            get() = this@LexicalWritableScope.isOwnerDescriptorAccessibleByLabel
        override val implicitReceiver: ReceiverParameterDescriptor?
            get() = this@LexicalWritableScope.implicitReceiver

        override fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean)
                = this@LexicalWritableScope.addedDescriptors.subList(0, descriptorLimit)

        override fun getContributedClassifier(name: Name, location: LookupLocation)
                = this@LexicalWritableScope.getDeclaredClassifier(name, descriptorLimit)

        override fun getContributedVariables(name: Name, location: LookupLocation)
                = this@LexicalWritableScope.getDeclaredVariables(name, descriptorLimit)

        override fun getContributedFunctions(name: Name, location: LookupLocation)
                = this@LexicalWritableScope.getDeclaredFunctions(name, descriptorLimit)

        override fun toString(): String = "Snapshot($descriptorLimit) for $debugName"

        override fun printStructure(p: Printer) {
            p.println("Snapshot with descriptorLimit = $descriptorLimit for scope:")
            this@LexicalWritableScope.printStructure(p)
        }
    }

    override fun toString(): String = debugName

    override fun printStructure(p: Printer) {
        p.println(javaClass.simpleName, ": ", debugName, "; for descriptor: ", ownerDescriptor.name,
                  " with implicitReceiver: ", implicitReceiver?.value ?: "NONE", " {")
        p.pushIndent()

        p.print("parent = ")
        parent.printStructure(p.withholdIndentOnce())

        p.popIndent()
        p.println("}")
    }
}
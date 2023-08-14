/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.test.generators

import org.jetbrains.kotlin.generators.generateTestGroupSuiteWithJUnit5
import org.jetbrains.kotlin.test.runners.*
import org.jetbrains.kotlin.test.utils.CUSTOM_TEST_DATA_EXTENSION_PATTERN

fun main(args: Array<String>) {
    val excludedCustomTestdataPattern = CUSTOM_TEST_DATA_EXTENSION_PATTERN

    generateTestGroupSuiteWithJUnit5(args) {
        testGroup(testsRoot = "compiler/tests-common-new/tests-gen", testDataRoot = "compiler/testData") {
            testClass<AbstractDiagnosticTest> {
                model("diagnostics/tests/when/testTask", pattern = "^(.*)\\.kts?$", excludedPattern = excludedCustomTestdataPattern)
            }
        }
    }
}
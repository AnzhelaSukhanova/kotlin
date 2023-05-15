/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.js.test.ir;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateJsTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/klibABI")
@TestDataPath("$PROJECT_ROOT")
public class JsPartialLinkageNoICES6TestCaseGenerated extends AbstractJsPartialLinkageNoICES6TestCase {
    @Test
    @TestMetadata("addEnumEntry")
    public void testAddEnumEntry() throws Exception {
        runTest("compiler/testData/klibABI/addEnumEntry/");
    }

    @Test
    @TestMetadata("addSealedSubclass")
    public void testAddSealedSubclass() throws Exception {
        runTest("compiler/testData/klibABI/addSealedSubclass/");
    }

    @Test
    public void testAllFilesPresentInKlibABI() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/klibABI"), Pattern.compile("^([^_](.+))$"), null, TargetBackend.JS_IR_ES6, false);
    }

    @Test
    @TestMetadata("changeClassVisibility")
    public void testChangeClassVisibility() throws Exception {
        runTest("compiler/testData/klibABI/changeClassVisibility/");
    }

    @Test
    @TestMetadata("changeFunctionVisibility")
    public void testChangeFunctionVisibility() throws Exception {
        runTest("compiler/testData/klibABI/changeFunctionVisibility/");
    }

    @Test
    @TestMetadata("changePropertyVisibility")
    public void testChangePropertyVisibility() throws Exception {
        runTest("compiler/testData/klibABI/changePropertyVisibility/");
    }

    @Test
    @TestMetadata("classTransformations")
    public void testClassTransformations() throws Exception {
        runTest("compiler/testData/klibABI/classTransformations/");
    }

    @Test
    @TestMetadata("externalDeclarations")
    public void testExternalDeclarations() throws Exception {
        runTest("compiler/testData/klibABI/externalDeclarations/");
    }

    @Test
    @TestMetadata("functionTransformations")
    public void testFunctionTransformations() throws Exception {
        runTest("compiler/testData/klibABI/functionTransformations/");
    }

    @Test
    @TestMetadata("inheritanceIssues")
    public void testInheritanceIssues() throws Exception {
        runTest("compiler/testData/klibABI/inheritanceIssues/");
    }

    @Test
    @TestMetadata("noNonImplementedCallableFalsePositives")
    public void testNoNonImplementedCallableFalsePositives() throws Exception {
        runTest("compiler/testData/klibABI/noNonImplementedCallableFalsePositives/");
    }

    @Test
    @TestMetadata("nonAbstractCallableBecomesAbstract")
    public void testNonAbstractCallableBecomesAbstract() throws Exception {
        runTest("compiler/testData/klibABI/nonAbstractCallableBecomesAbstract/");
    }

    @Test
    @TestMetadata("nonExhaustivenessOfWhenClause")
    public void testNonExhaustivenessOfWhenClause() throws Exception {
        runTest("compiler/testData/klibABI/nonExhaustivenessOfWhenClause/");
    }

    @Test
    @TestMetadata("propertyTransformations")
    public void testPropertyTransformations() throws Exception {
        runTest("compiler/testData/klibABI/propertyTransformations/");
    }

    @Test
    @TestMetadata("referencingUnusableDeclarations")
    public void testReferencingUnusableDeclarations() throws Exception {
        runTest("compiler/testData/klibABI/referencingUnusableDeclarations/");
    }

    @Test
    @TestMetadata("removeAbstractCallableFromAbstractClassOrInterface")
    public void testRemoveAbstractCallableFromAbstractClassOrInterface() throws Exception {
        runTest("compiler/testData/klibABI/removeAbstractCallableFromAbstractClassOrInterface/");
    }

    @Test
    @TestMetadata("removeCallable")
    public void testRemoveCallable() throws Exception {
        runTest("compiler/testData/klibABI/removeCallable/");
    }

    @Test
    @TestMetadata("removeClass")
    public void testRemoveClass() throws Exception {
        runTest("compiler/testData/klibABI/removeClass/");
    }

    @Test
    @TestMetadata("removeEnumEntry")
    public void testRemoveEnumEntry() throws Exception {
        runTest("compiler/testData/klibABI/removeEnumEntry/");
    }

    @Test
    @TestMetadata("removeSealedSubclass")
    public void testRemoveSealedSubclass() throws Exception {
        runTest("compiler/testData/klibABI/removeSealedSubclass/");
    }

    @Test
    @TestMetadata("replaceCallableReturnType")
    public void testReplaceCallableReturnType() throws Exception {
        runTest("compiler/testData/klibABI/replaceCallableReturnType/");
    }

    @Test
    @TestMetadata("severalInheritedImplementations")
    public void testSeveralInheritedImplementations() throws Exception {
        runTest("compiler/testData/klibABI/severalInheritedImplementations/");
    }

    @Test
    @TestMetadata("typeAliasChanges")
    public void testTypeAliasChanges() throws Exception {
        runTest("compiler/testData/klibABI/typeAliasChanges/");
    }
}

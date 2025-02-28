/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.light.classes.symbol.base;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/symbol-light-classes/testData/lightElements")
@TestDataPath("$PROJECT_ROOT")
public class LightClassUtilTestGenerated extends AbstractLightClassUtilTest {
  @Test
  public void testAllFilesPresentInLightElements() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/symbol-light-classes/testData/lightElements"), Pattern.compile("^(.+)\\.(kt)$"), null, true);
  }

  @Test
  @TestMetadata("mangledName.kt")
  public void testMangledName() {
    runTest("analysis/symbol-light-classes/testData/lightElements/mangledName.kt");
  }

  @Test
  @TestMetadata("mangledNameWithAnnotations.kt")
  public void testMangledNameWithAnnotations() {
    runTest("analysis/symbol-light-classes/testData/lightElements/mangledNameWithAnnotations.kt");
  }

  @Test
  @TestMetadata("propertyAccessor.kt")
  public void testPropertyAccessor() {
    runTest("analysis/symbol-light-classes/testData/lightElements/propertyAccessor.kt");
  }

  @Test
  @TestMetadata("propertyAccessorWithAnnotation.kt")
  public void testPropertyAccessorWithAnnotation() {
    runTest("analysis/symbol-light-classes/testData/lightElements/propertyAccessorWithAnnotation.kt");
  }

  @Test
  @TestMetadata("propertyAccessorWithImplicitAnnotation.kt")
  public void testPropertyAccessorWithImplicitAnnotation() {
    runTest("analysis/symbol-light-classes/testData/lightElements/propertyAccessorWithImplicitAnnotation.kt");
  }

  @Test
  @TestMetadata("propertyWithExplicitAccessors.kt")
  public void testPropertyWithExplicitAccessors() {
    runTest("analysis/symbol-light-classes/testData/lightElements/propertyWithExplicitAccessors.kt");
  }

  @Test
  @TestMetadata("propertyWithExplicitAccessorsAndAnnotation.kt")
  public void testPropertyWithExplicitAccessorsAndAnnotation() {
    runTest("analysis/symbol-light-classes/testData/lightElements/propertyWithExplicitAccessorsAndAnnotation.kt");
  }

  @Test
  @TestMetadata("propertyWithExplicitAccessorsAndAnnotationOnThem.kt")
  public void testPropertyWithExplicitAccessorsAndAnnotationOnThem() {
    runTest("analysis/symbol-light-classes/testData/lightElements/propertyWithExplicitAccessorsAndAnnotationOnThem.kt");
  }

  @Test
  @TestMetadata("propertyWithImplicitAccessors.kt")
  public void testPropertyWithImplicitAccessors() {
    runTest("analysis/symbol-light-classes/testData/lightElements/propertyWithImplicitAccessors.kt");
  }
}

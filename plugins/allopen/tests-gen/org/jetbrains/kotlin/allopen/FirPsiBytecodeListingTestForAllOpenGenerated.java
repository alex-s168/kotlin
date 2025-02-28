/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.allopen;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("plugins/allopen/testData/bytecodeListing")
@TestDataPath("$PROJECT_ROOT")
public class FirPsiBytecodeListingTestForAllOpenGenerated extends AbstractFirPsiBytecodeListingTestForAllOpen {
  @Test
  public void testAllFilesPresentInBytecodeListing() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/allopen/testData/bytecodeListing"), Pattern.compile("^(.+)\\.kt$"), Pattern.compile("^(.+)\\.fir\\.kts?$"), TargetBackend.JVM_IR, true);
  }

  @Test
  @TestMetadata("allOpenOnNotClasses.kt")
  public void testAllOpenOnNotClasses() {
    runTest("plugins/allopen/testData/bytecodeListing/allOpenOnNotClasses.kt");
  }

  @Test
  @TestMetadata("alreadyOpen.kt")
  public void testAlreadyOpen() {
    runTest("plugins/allopen/testData/bytecodeListing/alreadyOpen.kt");
  }

  @Test
  @TestMetadata("annotationMembers.kt")
  public void testAnnotationMembers() {
    runTest("plugins/allopen/testData/bytecodeListing/annotationMembers.kt");
  }

  @Test
  @TestMetadata("anonymousObject.kt")
  public void testAnonymousObject() {
    runTest("plugins/allopen/testData/bytecodeListing/anonymousObject.kt");
  }

  @Test
  @TestMetadata("explicitFinal.kt")
  public void testExplicitFinal() {
    runTest("plugins/allopen/testData/bytecodeListing/explicitFinal.kt");
  }

  @Test
  @TestMetadata("metaAnnotation_differentModules.kt")
  public void testMetaAnnotation_differentModules() {
    runTest("plugins/allopen/testData/bytecodeListing/metaAnnotation_differentModules.kt");
  }

  @Test
  @TestMetadata("metaAnnotation_sameModule.kt")
  public void testMetaAnnotation_sameModule() {
    runTest("plugins/allopen/testData/bytecodeListing/metaAnnotation_sameModule.kt");
  }

  @Test
  @TestMetadata("nestedClass.kt")
  public void testNestedClass() {
    runTest("plugins/allopen/testData/bytecodeListing/nestedClass.kt");
  }

  @Test
  @TestMetadata("nestedInner.kt")
  public void testNestedInner() {
    runTest("plugins/allopen/testData/bytecodeListing/nestedInner.kt");
  }

  @Test
  @TestMetadata("noAllOpen.kt")
  public void testNoAllOpen() {
    runTest("plugins/allopen/testData/bytecodeListing/noAllOpen.kt");
  }

  @Test
  @TestMetadata("privateMembers.kt")
  public void testPrivateMembers() {
    runTest("plugins/allopen/testData/bytecodeListing/privateMembers.kt");
  }

  @Test
  @TestMetadata("sealed.kt")
  public void testSealed() {
    runTest("plugins/allopen/testData/bytecodeListing/sealed.kt");
  }

  @Test
  @TestMetadata("severalAllOpen.kt")
  public void testSeveralAllOpen() {
    runTest("plugins/allopen/testData/bytecodeListing/severalAllOpen.kt");
  }

  @Test
  @TestMetadata("simple.kt")
  public void testSimple() {
    runTest("plugins/allopen/testData/bytecodeListing/simple.kt");
  }

  @Test
  @TestMetadata("springAnnotations.kt")
  public void testSpringAnnotations() {
    runTest("plugins/allopen/testData/bytecodeListing/springAnnotations.kt");
  }

  @Test
  @TestMetadata("superClassAnnotation.kt")
  public void testSuperClassAnnotation() {
    runTest("plugins/allopen/testData/bytecodeListing/superClassAnnotation.kt");
  }
}

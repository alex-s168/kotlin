/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.konan.test.blackbox;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.junit.jupiter.api.Tag;
import org.jetbrains.kotlin.konan.test.blackbox.support.EnforcedProperty;
import org.jetbrains.kotlin.konan.test.blackbox.support.ClassLevelProperty;
import org.jetbrains.kotlin.konan.test.blackbox.support.group.UseStandardTestCaseGroupProvider;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateNativeTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("native/native.tests/stress/testData")
@TestDataPath("$PROJECT_ROOT")
@Tag("stress")
@EnforcedProperty(property = ClassLevelProperty.EXECUTION_TIMEOUT, propertyValue = "5m")
@UseStandardTestCaseGroupProvider()
public class NativeStressTestGenerated extends AbstractNativeBlackBoxTest {
  @Test
  public void testAllFilesPresentInTestData() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("native/native.tests/stress/testData"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @Test
  @TestMetadata("array_out_of_memory.kt")
  public void testArray_out_of_memory() {
    runTest("native/native.tests/stress/testData/array_out_of_memory.kt");
  }

  @Test
  @TestMetadata("kt63423_dispose_on_main_stress.kt")
  public void testKt63423_dispose_on_main_stress() {
    runTest("native/native.tests/stress/testData/kt63423_dispose_on_main_stress.kt");
  }

  @Test
  @TestMetadata("stress_gc_allocations.kt")
  public void testStress_gc_allocations() {
    runTest("native/native.tests/stress/testData/stress_gc_allocations.kt");
  }
}

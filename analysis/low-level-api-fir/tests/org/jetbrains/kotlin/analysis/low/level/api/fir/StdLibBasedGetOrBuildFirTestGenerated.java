/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.low.level.api.fir;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/low-level-api-fir/testData/getOrBuildFirForStdLib")
@TestDataPath("$PROJECT_ROOT")
public class StdLibBasedGetOrBuildFirTestGenerated extends AbstractStdLibBasedGetOrBuildFirTest {
  @Test
  public void testAllFilesPresentInGetOrBuildFirForStdLib() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/low-level-api-fir/testData/getOrBuildFirForStdLib"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @Test
  @TestMetadata("emptyArray.kt")
  public void testEmptyArray() {
    runTest("analysis/low-level-api-fir/testData/getOrBuildFirForStdLib/emptyArray.kt");
  }

  @Test
  @TestMetadata("flattenArray.kt")
  public void testFlattenArray() {
    runTest("analysis/low-level-api-fir/testData/getOrBuildFirForStdLib/flattenArray.kt");
  }

  @Test
  @TestMetadata("fromBits.kt")
  public void testFromBits() {
    runTest("analysis/low-level-api-fir/testData/getOrBuildFirForStdLib/fromBits.kt");
  }
}

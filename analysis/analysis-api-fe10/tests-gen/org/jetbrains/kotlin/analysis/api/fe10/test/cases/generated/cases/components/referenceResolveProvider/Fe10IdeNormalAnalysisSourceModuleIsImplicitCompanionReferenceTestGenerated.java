/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fe10.test.cases.generated.cases.components.referenceResolveProvider;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.analysis.api.fe10.test.configurator.AnalysisApiFe10TestConfiguratorFactory;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfiguratorFactoryData;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfigurator;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.TestModuleKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.FrontendKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisSessionMode;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiMode;
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.components.referenceResolveProvider.AbstractIsImplicitCompanionReferenceTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/referenceResolveProvider/isImplicitReferenceToCompanion")
@TestDataPath("$PROJECT_ROOT")
public class Fe10IdeNormalAnalysisSourceModuleIsImplicitCompanionReferenceTestGenerated extends AbstractIsImplicitCompanionReferenceTest {
  @NotNull
  @Override
  public AnalysisApiTestConfigurator getConfigurator() {
    return AnalysisApiFe10TestConfiguratorFactory.INSTANCE.createConfigurator(
      new AnalysisApiTestConfiguratorFactoryData(
        FrontendKind.Fe10,
        TestModuleKind.Source,
        AnalysisSessionMode.Normal,
        AnalysisApiMode.Ide
      )
    );
  }

  @Test
  public void testAllFilesPresentInIsImplicitReferenceToCompanion() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/referenceResolveProvider/isImplicitReferenceToCompanion"), Pattern.compile("^(.+)\\.kt$"), null, true);
  }

  @Test
  @TestMetadata("classAccessWithExplicitReferenceToCompanion.kt")
  public void testClassAccessWithExplicitReferenceToCompanion() {
    runTest("analysis/analysis-api/testData/components/referenceResolveProvider/isImplicitReferenceToCompanion/classAccessWithExplicitReferenceToCompanion.kt");
  }

  @Test
  @TestMetadata("classAccessWithExplicitReferenceToNamedCompanion.kt")
  public void testClassAccessWithExplicitReferenceToNamedCompanion() {
    runTest("analysis/analysis-api/testData/components/referenceResolveProvider/isImplicitReferenceToCompanion/classAccessWithExplicitReferenceToNamedCompanion.kt");
  }

  @Test
  @TestMetadata("constructorCall.kt")
  public void testConstructorCall() {
    runTest("analysis/analysis-api/testData/components/referenceResolveProvider/isImplicitReferenceToCompanion/constructorCall.kt");
  }

  @Test
  @TestMetadata("constructorCallWithInvokeInCompanion.kt")
  public void testConstructorCallWithInvokeInCompanion() {
    runTest("analysis/analysis-api/testData/components/referenceResolveProvider/isImplicitReferenceToCompanion/constructorCallWithInvokeInCompanion.kt");
  }

  @Test
  @TestMetadata("explicitReferenceToCompanion.kt")
  public void testExplicitReferenceToCompanion() {
    runTest("analysis/analysis-api/testData/components/referenceResolveProvider/isImplicitReferenceToCompanion/explicitReferenceToCompanion.kt");
  }

  @Test
  @TestMetadata("explicitReferenceToNamedCompanion.kt")
  public void testExplicitReferenceToNamedCompanion() {
    runTest("analysis/analysis-api/testData/components/referenceResolveProvider/isImplicitReferenceToCompanion/explicitReferenceToNamedCompanion.kt");
  }

  @Test
  @TestMetadata("impicitReferenceToCompanion.kt")
  public void testImpicitReferenceToCompanion() {
    runTest("analysis/analysis-api/testData/components/referenceResolveProvider/isImplicitReferenceToCompanion/impicitReferenceToCompanion.kt");
  }

  @Test
  @TestMetadata("qualifierReferenceToClassWithCompanion.kt")
  public void testQualifierReferenceToClassWithCompanion() {
    runTest("analysis/analysis-api/testData/components/referenceResolveProvider/isImplicitReferenceToCompanion/qualifierReferenceToClassWithCompanion.kt");
  }
}

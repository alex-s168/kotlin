// DO NOT EDIT MANUALLY!
// Generated by org/jetbrains/kotlin/generators/arguments/GenerateGradleOptions.kt
// To regenerate run 'generateGradleOptions' task
@file:Suppress("RemoveRedundantQualifierName", "Deprecation", "Deprecation_Error", "DuplicatedCode")

package org.jetbrains.kotlin.gradle.dsl

internal abstract class KotlinJvmCompilerOptionsDefault @javax.inject.Inject constructor(
    objectFactory: org.gradle.api.model.ObjectFactory
) : org.jetbrains.kotlin.gradle.dsl.KotlinCommonCompilerOptionsDefault(objectFactory), org.jetbrains.kotlin.gradle.dsl.KotlinJvmCompilerOptions {

    override val javaParameters: org.gradle.api.provider.Property<kotlin.Boolean> =
        objectFactory.property(kotlin.Boolean::class.java).convention(false)

    override val jvmTarget: org.gradle.api.provider.Property<org.jetbrains.kotlin.gradle.dsl.JvmTarget> =
        objectFactory.property(org.jetbrains.kotlin.gradle.dsl.JvmTarget::class.java).convention(org.jetbrains.kotlin.gradle.dsl.JvmTarget.DEFAULT)

    override val moduleName: org.gradle.api.provider.Property<kotlin.String> =
        objectFactory.property(kotlin.String::class.java)

    override val noJdk: org.gradle.api.provider.Property<kotlin.Boolean> =
        objectFactory.property(kotlin.Boolean::class.java).convention(false)
}

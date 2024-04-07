/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

@file:kotlin.jvm.JvmMultifileClass
@file:kotlin.jvm.JvmName("StringsKt")

package kotlin.text

//
// NOTE: THIS FILE IS AUTO-GENERATED by the GenerateStandardLib.kt
// See: https://github.com/JetBrains/kotlin/tree/master/libraries/stdlib
//


/**
 * Returns a character at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this char sequence.
 * 
 * @sample samples.collections.Collections.Elements.elementAt
 */
@kotlin.internal.InlineOnly
public actual inline fun CharSequence.elementAt(index: Int): Char {
    return get(index)
}

/**
 * Returns a new [SortedSet][java.util.SortedSet] of all characters.
 */
public fun CharSequence.toSortedSet(): java.util.SortedSet<Char> {
    return toCollection(java.util.TreeSet<Char>())
}

@Deprecated("Use maxOrNull instead.", ReplaceWith("this.maxOrNull()"))
@DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
@Suppress("CONFLICTING_OVERLOADS")
public fun CharSequence.max(): Char? {
    return maxOrNull()
}

@Deprecated("Use maxByOrNull instead.", ReplaceWith("this.maxByOrNull(selector)"))
@DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
@Suppress("CONFLICTING_OVERLOADS")
public inline fun <R : Comparable<R>> CharSequence.maxBy(selector: (Char) -> R): Char? {
    return maxByOrNull(selector)
}

@Deprecated("Use maxWithOrNull instead.", ReplaceWith("this.maxWithOrNull(comparator)"))
@DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
@Suppress("CONFLICTING_OVERLOADS")
public fun CharSequence.maxWith(comparator: Comparator<in Char>): Char? {
    return maxWithOrNull(comparator)
}

@Deprecated("Use minOrNull instead.", ReplaceWith("this.minOrNull()"))
@DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
@Suppress("CONFLICTING_OVERLOADS")
public fun CharSequence.min(): Char? {
    return minOrNull()
}

@Deprecated("Use minByOrNull instead.", ReplaceWith("this.minByOrNull(selector)"))
@DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
@Suppress("CONFLICTING_OVERLOADS")
public inline fun <R : Comparable<R>> CharSequence.minBy(selector: (Char) -> R): Char? {
    return minByOrNull(selector)
}

@Deprecated("Use minWithOrNull instead.", ReplaceWith("this.minWithOrNull(comparator)"))
@DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
@Suppress("CONFLICTING_OVERLOADS")
public fun CharSequence.minWith(comparator: Comparator<in Char>): Char? {
    return minWithOrNull(comparator)
}

/**
 * Returns the sum of all values produced by [selector] function applied to each character in the char sequence.
 */
@SinceKotlin("1.4")
@OptIn(kotlin.experimental.ExperimentalTypeInference::class)
@OverloadResolutionByLambdaReturnType
@kotlin.jvm.JvmName("sumOfBigDecimal")
@kotlin.internal.InlineOnly
public inline fun CharSequence.sumOf(selector: (Char) -> java.math.BigDecimal): java.math.BigDecimal {
    var sum: java.math.BigDecimal = 0.toBigDecimal()
    for (element in this) {
        sum += selector(element)
    }
    return sum
}

/**
 * Returns the sum of all values produced by [selector] function applied to each character in the char sequence.
 */
@SinceKotlin("1.4")
@OptIn(kotlin.experimental.ExperimentalTypeInference::class)
@OverloadResolutionByLambdaReturnType
@kotlin.jvm.JvmName("sumOfBigInteger")
@kotlin.internal.InlineOnly
public inline fun CharSequence.sumOf(selector: (Char) -> java.math.BigInteger): java.math.BigInteger {
    var sum: java.math.BigInteger = 0.toBigInteger()
    for (element in this) {
        sum += selector(element)
    }
    return sum
}


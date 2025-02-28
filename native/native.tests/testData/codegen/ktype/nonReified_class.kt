/*
 * Copyright 2010-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the LICENSE file.
 */

import kotlin.test.*
import kotlin.reflect.*

class C<T> {
    @OptIn(kotlin.ExperimentalStdlibApi::class)
    fun foo() = typeOf<List<T>>()
}

fun box(): String {
    val l = C<Int>().foo()
    assertEquals(List::class, l.classifier)
    val t = l.arguments.single().type!!.classifier
    assertTrue(t is KTypeParameter)
    assertFalse((t as KTypeParameter).isReified)
    assertEquals("T", (t as KTypeParameter).name)

    return "OK"
}

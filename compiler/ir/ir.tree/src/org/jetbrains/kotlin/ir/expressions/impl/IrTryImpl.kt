/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.ir.expressions.impl

import org.jetbrains.kotlin.ir.declarations.IrAttributeContainer
import org.jetbrains.kotlin.ir.expressions.IrCatch
import org.jetbrains.kotlin.ir.expressions.IrExpression
import org.jetbrains.kotlin.ir.expressions.IrTry
import org.jetbrains.kotlin.ir.types.IrType
import org.jetbrains.kotlin.ir.util.IrElementConstructorIndicator
import org.jetbrains.kotlin.utils.SmartList

class IrTryImpl internal constructor(
    @Suppress("UNUSED_PARAMETER")
    constructorIndicator: IrElementConstructorIndicator?,
    override val startOffset: Int,
    override val endOffset: Int,
    override var type: IrType,
) : IrTry() {
    override lateinit var tryResult: IrExpression

    override val catches: MutableList<IrCatch> = SmartList()

    override var finallyExpression: IrExpression? = null

    override var attributeOwnerId: IrAttributeContainer = this
    override var originalBeforeInline: IrAttributeContainer? = null
}

fun IrTryImpl(
    startOffset: Int,
    endOffset: Int,
    type: IrType,
) = IrTryImpl(
    constructorIndicator = null,
    startOffset = startOffset,
    endOffset = endOffset,
    type = type,
)

fun IrTryImpl(
    startOffset: Int,
    endOffset: Int,
    type: IrType,
    tryResult: IrExpression,
    catches: List<IrCatch>,
    finallyExpression: IrExpression?,
) = IrTryImpl(
    constructorIndicator = null,
    startOffset = startOffset,
    endOffset = endOffset,
    type = type,
).apply {
    this.tryResult = tryResult
    this.catches.addAll(catches)
    this.finallyExpression = finallyExpression
}

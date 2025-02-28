/*
 * Copyright 2010-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.ir.expressions.impl

import org.jetbrains.kotlin.ir.IrImplementationDetail
import org.jetbrains.kotlin.ir.IrStatement
import org.jetbrains.kotlin.ir.declarations.IrFactory
import org.jetbrains.kotlin.ir.declarations.impl.IrFactoryImpl
import org.jetbrains.kotlin.ir.expressions.IrBlockBody
import org.jetbrains.kotlin.utils.IDEAPlatforms
import org.jetbrains.kotlin.utils.IDEAPluginsCompatibilityAPI

class IrBlockBodyImpl @IrImplementationDetail constructor(
    override val startOffset: Int,
    override val endOffset: Int
) : IrBlockBody() {

    @IrImplementationDetail
    @IDEAPluginsCompatibilityAPI(
        IDEAPlatforms._233,
        message = "Use IrFactory instead of creating IR nodes directly",
        plugins = "compose-ide-plugin",
    )
    constructor(startOffset: Int, endOffset: Int, statements: List<IrStatement>) : this(startOffset, endOffset) {
        this.statements.addAll(statements)
    }

    override val statements: MutableList<IrStatement> = ArrayList(2)

    override val factory: IrFactory
        get() = IrFactoryImpl
}

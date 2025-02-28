// CHECK_TYPESCRIPT_DECLARATIONS
// TARGET_BACKEND: WASM
// MODULE: main
// FILE: primitives.kt

@JsExport
fun produceBoolean(): Boolean = true

@JsExport
fun produceByte(): Byte = Byte.MAX_VALUE

@JsExport
fun produceShort(): Short = Short.MAX_VALUE

@JsExport
fun produceInt(): Int = Int.MAX_VALUE

@JsExport
fun produceLong(): Long = Long.MAX_VALUE

@JsExport
fun produceChar(): Char = 'a'

@JsExport
fun produceString(): String = "OK"

private var state = "INITIAL"

@JsExport
fun getState(): String = state

@JsExport
fun mutateState() {
    state = "MUTATED"
}

@JsExport
fun produceFunction(): () -> Int = ::produceInt

@JsExport
fun consumeBoolean(x: Boolean): String = x.toString()

@JsExport
fun consumeByte(x: Byte): String = x.toString()

@JsExport
fun consumeShort(x: Short): String = x.toString()

@JsExport
fun consumeInt(x: Int): String = x.toString()

@JsExport
fun consumeLong(x: Long): String = x.toString()

@JsExport
fun consumeChar(x: Char): String = x.toString()

@JsExport
fun consumeString(x: String): String = x

@JsExport
fun consumeFunction(fn: (String) -> Int): Int = fn("42")

// FILE: entry.mjs

import main from "./index.mjs"

// PRODUCING
if (!main.produceBoolean()) throw new Error("Unexpected value was returned from the `produceBoolean` function")
if (main.produceByte() != 127) throw new Error("Unexpected value was returned from the `produceByte` function")
if (main.produceShort() != 32767) throw new Error("Unexpected value was returned from the `produceShort` function")
if (main.produceInt() != 2147483647) throw new Error("Unexpected value was returned from the `produceInt` function")
if (main.produceLong() != 9223372036854775807n) throw new Error("Unexpected value was returned from the `produceLong` function")
if (String.fromCharCode(main.produceChar()) != "a") throw new Error("Unexpected value was returned from the `produceChar` function")
if (main.produceString() != "OK") throw new Error("Unexpected value was returned from the `produceString` function")
if (main.getState() != "INITIAL") throw new Error("Unexpected value was returned from the `getState` function before the mutation")
main.mutateState()
if (main.getState() != "MUTATED") throw new Error("Unexpected value was returned from the `getState` function after the mutation")
if (main.produceFunction()() != 2147483647) throw new Error("Unexpected value was returned from the `produceFunction` function")

// CONSUMPTION
if (main.consumeBoolean(false) != "false") throw new Error("Unexpected value was returned from the `consumeBoolean` function")
if (main.consumeByte(-128) != "-128") throw new Error("Unexpected value was returned from the `consumeByte` function")
if (main.consumeShort(-32768) != "-32768") throw new Error("Unexpected value was returned from the `consumeShort` function")
if (main.consumeInt(-2147483648) != "-2147483648") throw new Error("Unexpected value was returned from the `consumeInt` function")
if (main.consumeLong(-9223372036854775808n) != "-9223372036854775808") throw new Error("Unexpected value was returned from the `consumeLong` function")
if (main.consumeChar("b".charCodeAt()) != "b") throw new Error("Unexpected value was returned from the `consumeChar` function")
if (main.consumeString("🙂") != "🙂") throw new Error("Unexpected value was returned from the `consumeString` function")
if (main.consumeFunction(parseInt) != 42) throw new Error("Unexpected value was returned from the `consumeFunction` function")

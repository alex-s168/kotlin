// FILE: main.kt
package a.b.c

val foo = 3

val <E> E.foo: Int
    get() = 4

object Receiver {
    val foo: Int
        get() = 5

    fun test(): Int {
        return <expr>Receiver.foo</expr>
    }
}

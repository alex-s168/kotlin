// ISSUE: KT-66570

fun testInference(container: IContainer<*, *>) {
    container.getProducer().<!UNRESOLVED_REFERENCE_WRONG_RECEIVER!>produce<!>
}

interface IContainer<out P : IProducer<T>, out T : IChild> {
    fun getProducer(): P
}

interface IProducer<out T : IParent> {
    val produce: T
}

interface IParent
interface IChild : IParent
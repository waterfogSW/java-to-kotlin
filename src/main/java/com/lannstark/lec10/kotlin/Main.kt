package com.lannstark.lec10.kotlin

fun main() {
    Derived(300)
}

open class Base(
    open val number: Int = 100,
) {
    init {
        println("Base class")
        //경고: 상속으로 인해 초기화 되지 않은 자식 number에 접근할 수도 있다.
        println(number)
    }
}

class Derived(
    override val number: Int,
) : Base(number) {
    init {
        println("Derived class")
    }
}

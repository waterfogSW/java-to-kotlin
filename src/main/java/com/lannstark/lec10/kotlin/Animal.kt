package com.lannstark.lec10.kotlin

abstract class Animal(
    protected val species: String,
    //추상 프로퍼티가 아니라면 프로퍼티 오버라이딩 시 open 키워드를 명시해 주어야 한다
    protected open val legCount: Int,
) {
    abstract fun move()
}

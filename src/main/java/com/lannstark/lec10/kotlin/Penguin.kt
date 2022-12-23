package com.lannstark.lec10.kotlin

class Penguin(
    species: String,
) : Animal(species, 2), Flyable, Swimable {

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄 날다")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount
    
    override fun act() {
        //중복되는 인터페이스를 특정할 때 <>를 사용한다
        super<Swimable>.act()
        super<Flyable>.act()
    }
}

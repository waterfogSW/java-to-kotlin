package com.lannstark.lec10.kotlin

interface Swimable {

    //getter에 대한 default parameter를 만든다고 생각하면 됨
    val swimAbility: Int
        get() = 3

    fun act() {
        println("첨벙첨벙")
    }
}

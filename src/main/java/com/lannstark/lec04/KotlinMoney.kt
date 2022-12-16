package com.lannstark.lec04

class KotlinMoney(private val amount: Long) {

    operator fun plus(money: KotlinMoney): KotlinMoney {
        return KotlinMoney(this.amount + money.amount)
    }

    override fun toString(): String {
        return "KotlinMoney(amount=$amount)"
    }


}

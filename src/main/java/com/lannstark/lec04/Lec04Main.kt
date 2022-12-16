package com.lannstark.lec04

fun main() {
    val money1 = JavaMoney(1_000L)
    val money2 = JavaMoney(2_000L)
    val money3 = money2
    val money4 = JavaMoney(2_000L)

    // 비교연산자는 자동으로 compareTo호출
    println("money1 > money2 : ${money1 > money2}")

    // 동일성 동등성 비교
    println("money2 === money4 : ${money2 === money4}")
    println("money2 == money4 : ${money2 == money4}")

    // 연산자 오버로딩이 가능하다
    val kotlinMoney1 = KotlinMoney(1_000L)
    val kotlinMoney2 = KotlinMoney(2_000L)

    println(kotlinMoney1 + kotlinMoney2)

}

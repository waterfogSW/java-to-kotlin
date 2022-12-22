package com.lannstark.lec06

fun forEach() {
    val longs = arrayListOf(1L, 2L, 3L)
    longs.forEach(::println)
}

fun forLoopDown() {
    val longs = arrayListOf(1L, 2L, 3L)
    for (i in 2 downTo 0) {
        println(longs[i])
    }
}

fun forLoopStep2() {
    for (i in 0..5 step 2) {
        println(i)
    }
}

fun doWhile() {
    var i = 1
    do {
        println(i)
        i++
    } while (i <= 3)
}

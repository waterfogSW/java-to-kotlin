package com.lannstark.lec15

fun handleArr() {
    val arr = arrayOf(10, 20)
    arr.plus(30)
    for (i in arr) {
        println(i)
    }

    for (i in arr.indices) {
        println("index: $i content: ${arr[i]}")
    }

    for ((idx, content) in arr.withIndex()) {
        println("index: $idx content: $content")
    }
}

fun handleList() {
    val list = listOf(10, 20, 30)
    val emptyList = emptyList<Int>() //타입을 명시해야 한다

    for (i in list.indices) {
        println("index: $i content: ${list[i]}")
    }

    for ((idx, content) in list.withIndex()) {
        println("index: $idx content: $content")
    }

    //list.add() 값의 수정이 불가능하다 기본적으로 unmodifieable
    //emptyList.add()

    val mutableListOf = mutableListOf(10, 20)
    mutableListOf.add(30)
}

fun handleSet() {
    val set = setOf(10, 20, 30)
    val emptySet = emptySet<Int>()

    for ((idx, content) in set.withIndex()) {
        println("index: $idx content: $content")
    }
}

fun handleMap() {
    val immutableMap = mapOf(1 to "test1", 2 to "test2")

    val map = mutableMapOf<Int, String>()
    map[1] = "test1"
    map[2] = "test2"
    map[3] = "test3"

    for((key, value) in map.entries) {
        println("key: $key, value: $value")
    }
}

class TestCollection(
    val list: List<Int> = mutableListOf()
)

fun main() {

}

package com.lannstark.lec17

import java.io.BufferedReader
import java.io.FileReader

fun main() {
    val fruits = listOf(
        Fruit("사과", 1000),
        Fruit("사과", 1200),
        Fruit("사과", 1200),
        Fruit("사과", 1500),
        Fruit("바나나", 3000),
        Fruit("바나나", 3200),
        Fruit("바나나", 2500),
        Fruit("수박", 10000)
    )

    //마지막 파라미터가 함수인경우 중괄호로 전달할 수 있다.
    filterFruits(fruits) { it.name == "사과"}

    //함수를 전달 받는 입장에서 보다 명확한 코드
    filterFruits(fruits) { fruit ->  fruit.name == "사과"}

    val isApple = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    val isApple2 = { fruit: Fruit -> fruit.name == "사과" }

    //자바와 달리 final 이 아닌 변수를 람다식에 넣어도 에러가 나지 않는다.
    //클로저 : 함수 밖에 정의된 변수들을 사용할 수 있는 함수
    var notFinalName = "바나나"
    notFinalName = "수박"
    filterFruits(fruits) { fruit -> fruit.name == notFinalName }


}

private fun filterFruits(
    fruits: List<Fruit>,
    fruitFilter: (Fruit) -> Boolean,
): List<Fruit> {
    return fruits.filter(fruitFilter)
        .toList()

}

fun readFile(path: String) =
    BufferedReader(FileReader(path)).use { reader -> println(reader.readLine()) }

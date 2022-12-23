package com.lannstark.lec08

//함수 타입 생략 가능, 만약 중괄호(block)을 사용하는 경우 타입을 명시해 주어야 한다.
fun max(a: Int, b: Int) = if (a > b) a else b

//default parameter
fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)

        }
    }
}

//named argument default파라미터가 있는 파라미터중, 어떤 파라미터에 값을 넣을지 명시
//builder를 직접 만들지 않고, builder의 장점을 가지게 된다
//단 코틀린에서 자바 함수를 갖다 쓸경우 named parameter를 사용할 수 없다.
fun main () {
    repeat("Hello world", useNewLine = false)

    printAll("A", "B", "C")
    val arr = arrayOf("A", "B", "C")
    //spread 연산자, 배열의 값을 퍼뜨림, 해당 연산자 없이 바로 전달할 수 없다.
    printAll(*arr)
}

//가변인자
fun printAll(vararg strings: String) {
    for(str in strings) {
        println(str)
    }
}

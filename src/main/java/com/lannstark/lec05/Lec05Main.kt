package com.lannstark.lec05

/**
 * Statement : 프로그램의 문장, 하나의 값으로 도출되지 않는다
 * Expression : 하나의 값으로 도출되는 문장
 * 코틀린에서 if - else 는 자바와 달리 expression으로 취급한다
 * 때문에 코틀린은 삼항 연산자를 지원하지 않는다.
 */


fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

fun startWithA(obj: Any): Boolean {
    return if (obj is String) obj.startsWith("A") else false
}

fun judgeNumber1(number: Int) {
    when (number) {
        -1, 0, 1 -> println("어디서 많이 본 숫자입니다")
        else -> println("-1 0 1이 아닙니다")
    }
}

fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다")
        else -> println("주어진 숫자는 홀수입니다")
    }

}

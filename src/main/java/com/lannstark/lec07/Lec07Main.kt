package com.lannstark.lec07

fun parseIntOrThrow(str: String): Int {
    //kotlin에서는 try catch가 expression이다
    return try {
        str.toInt() //기본 타입간의 형변환은 toType을 사용한다
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("$str 는 숫자가 아닙니다")
    }
}

fun parseINtOrThrow2(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

fun main() {
    FilePrinter().readFile("src/main/java/com/lannstark/lec07/a.txt")
}

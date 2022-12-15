package com.lannstark.lec02

fun startWithA1(str: String?): Boolean {
    return str?.startsWith("A")
        //elvis 연산자(?: 오른쪽으로 돌리면 엘비스의 머리를 닮음)
        ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

fun startWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startWithA4(str: String?): Boolean {
    //만약 null이 들어오는 경우 런타임에 NPE를 발생시킨다.
    return str!!.startsWith("A")
}

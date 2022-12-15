package com.lannstark.lec03

fun printInfoIfPerson(obj: Any) {
    if (obj is Person) {
        println("이름: ${obj.name} 나이: ${obj.age}")
    }
}

fun printInfoIfNullablePerson(obj: Any?) {
    val person = obj as Person?
    println("이름: ${obj?.name} 나이: ${obj?.age}")
}

//특이한 데이터 타입 3가지 : Any, Unit, Nothing

//Unit은 void와 같다, 다만 void와 다르게 타입 인자로 전달할 수 있다
interface ShapeArea<T> {
    fun clac(): T
}

class NoResultProcessor : ShapeArea<Unit> {
    override fun clac() {
        println("36")
    }
}

//Nothing은 함수가 정상적으로 끝나지 않음을 표현하는 역할
fun fail(): Nothing {
    throw IllegalArgumentException()
}

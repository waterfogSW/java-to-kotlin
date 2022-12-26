package com.lannstark.lec16

/*
확장함수 : 기존 클래스에 코틀린 코드를 얹는 방법
캡슐화를 지키기 위해 클래스의 private protected 멤버 변수는 가져다 쓸 수 없다.
 */
fun String.getLastChar(): Char {
    //this를 통해 실제 클래스에 접근
    return this[this.length - 1]
}

//확장 프로퍼티로도 활용이 가능하다
val String.getFirstChar: Char
    get() = this[0]

//확장 함수와 동일한 시그니쳐의 멤버 함수가 존재할 경우 멤버함수가 우선적으로 호출된다.
fun String.get() {
    println("확장함수 호출")
}

open class Train(
    val name: String = "train",
    val price: Long = 5_000L,
)

fun Train.isExpensive(): Boolean {
    println("train 의 확장 함수")
    return this.price >= 10_000L
}

class SRT : Train("SRT", 40_000L)

fun SRT.isExpensive(): Boolean {
    println("srt의 확장 함수")
    return this.price >= 20_000L
}

/*
중위함수
함수를 호출하는 새로운 방법
ex. downTo, step
 */
infix fun Int.add(num: Int): Int {
    return this + num
}

/*
inline 함수
함수를 파라미터로 전달할때읙 오버헤드를 줄일수 있다
이미 어느정도 최적화 되어 있기대문에 성능 측정과 함께 신중하게 사용해야 한다
 */
inline fun Int.add2(num: Int): Int {
    return this + num
}


fun main() {
    val result = "Hello world".getLastChar()
    println(result)


    println("안녕".get(1))

    val train = Train()
    val srt: Train = SRT() //누구의 인스턴스인지가 아니라 현재 타입을 따라간다
    val srt2 = SRT()

    println(train.isExpensive())
    println(srt.isExpensive())
    println(srt2.isExpensive())

    println(1 add 3)
    println(1.add2(2))
}

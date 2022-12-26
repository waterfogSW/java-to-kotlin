package com.lannstark.lec14

fun showKoreanName(country: Country) {
    when (country) {
        Country.KOREA -> println("한국")
        Country.UNITED_STATE -> println("미국")
    }
}

//equals, hashcode를 모두 구현하고 있다.
data class PersonDto(
    val name: String,
    val age: Int,
)

//자기 자신이 추상클래스이고 컴파일 타임에 하위 클래스를 모두 기억하고 있다.
sealed class HyundaiCar(
    val name: String,
    val price: Long
)

class Avante : HyundaiCar("아반떼", 1_000L)
class Sonata : HyundaiCar("소나타", 2_000L)
class Grandeur : HyundaiCar("그렌저", 4_000L)

fun handleCar(car: HyundaiCar) {
    //sealed class가 enum처럼 하위 타입을 모두 기억하고 있기 때문에 다음과 같은 구현이 가능하다
    when (car) {
        is Avante -> TODO()
        is Grandeur -> TODO()
        is Sonata -> TODO()
    }
}

fun main() {
    showKoreanName(Country.KOREA)
    val personDto1 = PersonDto("홍길동", 26)
    val personDto2 = PersonDto("홍길동", 27)
    val personDto3 = PersonDto("홍길동", 27)

    println(personDto1 == personDto2)
    println(personDto2 == personDto3)
    println(personDto2 === personDto3)
}

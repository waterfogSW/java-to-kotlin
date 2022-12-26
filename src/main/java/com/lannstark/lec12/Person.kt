package com.lannstark.lec12

class Person(
    var name: String,
    var age: Int = 0,
) {
    companion object Factory {
        //컴파일 타임 초기화
        private const val MIN_AGE = 1

        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        @JvmStatic
        fun staticNewBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }
    }
}

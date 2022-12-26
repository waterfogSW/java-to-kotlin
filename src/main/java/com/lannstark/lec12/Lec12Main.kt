package com.lannstark.lec12

fun main() {
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)


    moveSomething(object : Movable {
        override fun move() {
            println("움직인다~")
        }

        override fun fly() {
            println("난다~")
        }
    })
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}

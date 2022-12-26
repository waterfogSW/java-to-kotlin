package com.lannstark.lec13

class House(
    private val address: String,
    private val livingRoom: LivingRoom = LivingRoom(10.0),
) {
    /*
    권장되는 방식의 내부 클래스 생성(기본적으로 static class이다)
    static class는 클래스 로드 시점에 생성되어
    상위클래스에 대한 직접적인 참조를 가지고 있지 않기 때문에
    메모리 누수 관리 이점이 있다.
     */
    class LivingRoom(
        val area: Double,
    )

    inner class DinningRoom(
        val area: Double,
    ) {
        //상위 클래스에 접근하기 위해서는 this@{클래스 명}으로 접근한다
        val address: String
            get() = this@House.address
    }

}

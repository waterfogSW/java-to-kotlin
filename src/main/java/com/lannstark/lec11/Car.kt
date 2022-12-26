package com.lannstark.lec11

//생성자에 접근 지시어를 붙이기 위해서는 constructor키워드를 붙여줘야 한다
class Car private constructor(
    val name: String,
    _description: String
) {

    //setter의 접근지정자를 설정 할 수 있다
    var description: String  = _description
        private set
    //getter의 경우 변수의 접근 지정자를 따라간다



}

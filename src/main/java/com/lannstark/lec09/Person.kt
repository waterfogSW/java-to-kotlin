package com.lannstark.lec09

fun main() {
    //java로 만들어진 클래스를 호출할 때에도 .(필드명)으로 getter setter를 호출한다
    val javaPerson = JavaPerson("김산", 25)
    javaPerson.age = 26
    println(javaPerson.toString())

    //kotlin person
    val person = Person("김산", 25)
    person.age = 26
    println(person.toString())

    //초기화블록 -> 첫번째 부생성자 -> 두번째 부생성자 순으로 호출된다.
    Person()

    //하지만 코틀린은 부생성자 보다는 default parameter 사용을 권장한다
}

class Person(
    val name: String = "홍길동",
    var age: Int = 1,
) {
    //객체 생성 검증로직을 init을 통해 구현할 수 있다.
    init {
        //초기화 블록
        if (age <= 0) {
            throw IllegalArgumentException("나이는 $age 일 수 없습니다")
        }
        println("초기화 블록")
    }

    constructor(name: String) : this(name, 1) {
        println("첫번째 부 생성자")
    }

    constructor() : this("홍길동") {
        println("두번째 부 생성자")
    }

    //속성을 확인하는것이라면 custom getter를 통해 프로퍼티 처럼 사용할 수 있다.
    val isAdult: Boolean get() = this.age >= 20

    //name을 get할때 무조건 대문자로 가져오기
    val uppercaseName: String get() = this.name.uppercase()

    //custom setter도 가능
    /**
     * var name = name
     *     set(value) {
     *         field = value.uppercase()
     *     }
     * setter는 지양하기 때문에 잘 안씀
     */
}

class BackingFieldPerson(
    name: String,
    var age: Int
) {
    val name = name
        get() = field.uppercase() // 무한루프를 방지하기위한 예약어, 자기자신(name)을 가리킨다

}

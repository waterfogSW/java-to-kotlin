package com.lannstark.lec12;

public class Lec12Main {

  public static void main(String[] args) {
    //companion object의 이름을 통해 static 함수에 접근 가능하다
    //만약 이름이 없다면 Person.Companion.newBaby("ABC")와 같은 형태로 접근
    Person.Factory.newBaby("ABC");

    //자바에서 static 함수에 접근하듯 사용하고 싶다면
    //해당 함수에 @JvmStatic 어노테이션을 붙여줘야 한다
    Person.staticNewBaby("ABC");
  }

}

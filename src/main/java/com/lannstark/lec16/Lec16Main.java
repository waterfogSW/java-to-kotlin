package com.lannstark.lec16;

public class Lec16Main {

  public static void main(String[] args) {

    System.out.println("Hello World");

    //확장 함수는 유틸리티처럼 활용할 수 있다.
    var s = Lec16MainKt.getLastChar("hello");
    System.out.println(s);

    int number = 100;

  }

}

package com.lannstark.lec08;

public class Lec08Main {

  public static void main(String[] args) {

  }

  public static int max(
      int a,
      int b
  ) {
    if (a > b) {
      return a;
    } else {
      return b;
    }
  }

  public static void repeat(
      String str,
      int num,
      boolean useNewLine
  ) {
    for (int i = 0; i < num; i++) {
      if (useNewLine) {
        System.out.println(str);
      } else {
        System.out.print(str);
      }
    }
  }

  public static void repeat(
      String str,
      int num
  ) {
    repeat(str, num, true);
  }

  public static void repeat(String str) {
    repeat(str, 3);
  }

  public static void printAll(String... strings) {
    for (String str : strings) {
      System.out.println(str);
    }
  }

}

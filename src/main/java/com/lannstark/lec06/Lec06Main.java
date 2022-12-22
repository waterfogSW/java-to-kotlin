package com.lannstark.lec06;

import java.util.Arrays;
import java.util.List;

public class Lec06Main {

  private static void forEach() {
    List<Long> longs = Arrays.asList(1L, 2L, 3L);
    longs.forEach(System.out::println);
  }

  private static void forLoopDown() {
    List<Long> longs = Arrays.asList(1L, 2L, 3L);
    for(int i = 2; i >= 0; i--) {
      System.out.println(longs.get(i));
    }
  }

  private static void forLoopStep2() {
    for(int i = 0; i <= 5; i += 2) {
      System.out.println(i);
    }
  }



  public static void main(String[] args) {

    for (int i = 1; i <= 5; i += 2) {
      System.out.println(i);
    }

    int i = 1;
    while (i <= 3) {
      System.out.println(i);
      i++;
    }

  }

}

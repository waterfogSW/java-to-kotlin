package com.lannstark.lec17;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Lec17Main {

  public static void main(String[] args) {
    List<Fruit> fruits = Arrays.asList(
        new Fruit("사과", 1_000),
        new Fruit("사과", 1_200),
        new Fruit("사과", 1_200),
        new Fruit("사과", 1_500),
        new Fruit("바나나", 3_000),
        new Fruit("바나나", 3_200),
        new Fruit("바나나", 2_500),
        new Fruit("수박", 10_000)
    );

    List<Fruit> apples = filterFruits(fruits, (Fruit::isApple));
    System.out.println(apples);
  }

  private static List<Fruit> filterFruits(
      List<Fruit> fruits,
      Predicate<Fruit> fruitFilter
  ) {
    return fruits.stream()
                 .filter(fruitFilter)
                 .toList();
  }

}

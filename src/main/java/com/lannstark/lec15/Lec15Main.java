package com.lannstark.lec15;

public class Lec15Main {

  public static void main(String[] args) {
    //not null 컬렉션임에도 불구하고 java에서 호출되는 경우 null값이 전달될 수 있다
    //따라서 코틀린 컬렉션을 자바에서 호출하는 경우 플랫폼 타입을 신경써야 한다.(ex, 방어코드 작성)
    TestCollection testCollection = new TestCollection();
    testCollection.getList()
                  .add(null);

    var result = testCollection.getList()
                  .get(0);

    System.out.println(result);
  }

}

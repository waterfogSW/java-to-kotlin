package com.lannstark.lec07;

import java.io.IOException;

public class Lec07Main {

  private int parseIntOrThrow(String str) {
    try {
      return Integer.parseInt(str);
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException(String.format("%s 는 숫자가 아닙니다", str));
    }
  }

  private Integer parseIntOrThrow2(String str) {
    try {
      return Integer.parseInt(str);
    } catch (NumberFormatException e) {
      return null;
    }
  }

  public static void main(String[] args) throws IOException {
    JavaFilePrinter javaFilePrinter = new JavaFilePrinter();
    javaFilePrinter.readFile("src/main/java/com/lannstark/lec07/a.txt");
  }

}

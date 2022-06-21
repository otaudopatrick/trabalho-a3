package com.trabalhoa3.delivery.util;

public class ConsoleIO {

  public static void typeWriter(String text) {
    char[] textToChar = text.toCharArray();
    try {
      for (int i = 0; i < textToChar.length; i++) {
        Thread.sleep(0);
        System.out.print(textToChar[i]);
      }
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

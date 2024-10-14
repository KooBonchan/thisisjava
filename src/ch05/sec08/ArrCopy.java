package ch05.sec08;

import java.util.Arrays;

public class ArrCopy {
  public static void main(String[] args) {
    int[] original = {1, 2, 3};
    int[] copy = new int[5];

    for(int i = 0; i < original.length; i++){
      copy[i] = original[i];
    }
    for(int i = 0; i < original.length; i++){
      System.out.println(copy[i]);
    }

  }
}

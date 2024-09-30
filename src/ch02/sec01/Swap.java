package ch02.sec01;

import java.util.Scanner;

public class Swap {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Var A: "); int a = sc.nextInt();
    System.out.print("Var B: "); int b = sc.nextInt();
    System.out.printf("Before swap, A: %d, B: %d\n",a,b);
    {
      int temp = a;
      a = b;
      b = temp;
    }
    System.out.printf("After swap,  A: %d, B: %d\n",a,b);
  }
}

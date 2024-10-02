package ch03.sec01;

import java.util.Scanner;

// 2 int, +-*/
public class Calculation {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Number A:");int a = scanner.nextInt();
    System.out.print("Number B:");int b = scanner.nextInt();

    System.out.println("A + B = " + (a + b));
    System.out.println("A - B = " + (a - b));
    System.out.println("A * B = " + (a * b));
    if(b != 0){
      System.out.printf("A / B = %.2f\n",(a / (float)b));
    } else{
      System.out.println("Zero Division");
    }
  }
}

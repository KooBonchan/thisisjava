package ch02.sec01;

import java.util.Scanner;

public class VarUse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Hour: "); int h = sc.nextInt();
    System.out.print("Min : "); int m = sc.nextInt();

    System.out.printf("%02d h %02d m\n", h, m);
    System.out.printf("total: %d min\n", h * 60 + m);  }
}

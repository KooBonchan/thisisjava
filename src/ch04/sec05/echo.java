package ch04.sec05;

import java.util.Scanner;

public class echo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s;
    System.out.println("Echoing message...");

    do{

      System.out.print("> ");
      s = scanner.nextLine();
      System.out.println(s);
    }while(!s.equalsIgnoreCase("q"));
  }
}

package ch04.sec05;

import java.util.Scanner;

public class keyControl {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int x = 0;

    while(true){
      System.out.println("Current speed: " + x + "km/h");
      System.out.println("1: Accel, 2: Brake");
      System.out.println("press Q to quit");
      System.out.println("----------------------------");

      String s = scanner.nextLine();

      if(s.equalsIgnoreCase("q")) break;
      char[] commands = s.toCharArray();
      for(char c : commands){
        if(c == '1') x++;
        else if (c == '2') x--;
      }
    }
    System.out.println("Quitting program...");
  }
}

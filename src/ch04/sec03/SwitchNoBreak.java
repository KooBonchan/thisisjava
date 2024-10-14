package ch04.sec03;

import java.util.Random;

public class SwitchNoBreak {
  public static void main(String[] args) {
    Random random = new Random();
    int time = random.nextInt(8,12);

    System.out.printf("[Now: %d:00AM]\n", time);

    switch(time){
      case 8:
        System.out.println("Go work");
      case 9:
        System.out.println("Go meeting");
      case 10:
        System.out.println("Work go");
      default:
        System.out.println("Go work out");
    }
  }
}

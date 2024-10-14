package ch04.sec07;

import java.util.Random;

public class InfLoop {
  public static void main(String[] args) {
    Random random = new Random();
    for(;;){
      int num = random.nextInt(1, 11);
      System.out.println(num);
      if(num == 6) break;
    }
  }
}

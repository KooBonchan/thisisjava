package ch14.sec03.exam01;

import java.awt.*;

public class Threading2 {
  public static void main(String[] args) {
    Thread thread = new Thread(() -> {

      for(int i = 0; i < 5; i++){
        System.err.println("NonBeep");
        try{
          Thread.sleep(500);
        } catch (InterruptedException e) {}
      }
    });
    thread.start();
    for(int i = 0; i < 5; i++){
      System.out.println("Beep");
      try{
        Thread.sleep(500);
      } catch (InterruptedException e) {}
    }

  }
}

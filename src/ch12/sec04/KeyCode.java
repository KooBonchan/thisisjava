package ch12.sec04;

import java.io.IOException;
import java.io.InputStreamReader;

public class KeyCode {
  public static void main(String[] args) {
    int speed = 0;
    int keyCode = 0;
    try(
      InputStreamReader inputStreamReader =  new InputStreamReader(System.in);
      ){
      while(true){
        if(keyCode != 13 && keyCode != 10){
          if(keyCode == 49){
            speed ++;
          } else if(keyCode == 50){
            speed --;
          } else if(keyCode == 51){
            break;
          }

          System.out.printf("""
          -------------------------
          1. Accel 2. Brake 3. Stop
          -------------------------
          Current:       %3dm/s
          Command:""", speed);
        }
        keyCode = inputStreamReader.read();
      }
      System.out.println("Halting program");
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}

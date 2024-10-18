package ch09.sec07.exam02;

import java.util.function.Consumer;

public class Main {
  public static void main(String[] args) {
    TV tv = new TV();
    TV brokenTv = new TV(null);
    TV wierdTv = new TV((log) -> {
      System.out.println("Beeeeeep");
    });

    tv.turnOn();
    tv.turnOff();

    brokenTv.turnOn();
    brokenTv.turnOff();

    wierdTv.turnOn();
    wierdTv.turnOff();
  }
}

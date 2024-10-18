package ch09.sec07.exam01;

import java.util.EventListener;

public class Main {
  public static void main(String[] args) {
    Car car = new Car();

    car.run();
    car.setTire(new Tire(){
      @Override
      void roll() {
        System.out.println("It works well");
      }
    }, 0);

    car.run();
  }
}

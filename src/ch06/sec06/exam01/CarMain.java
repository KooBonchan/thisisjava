package ch06.sec06.exam01;

import ch06.sec06.Car;

public class CarMain {
  public static void main(String[] args) {
    Car myCar = new Car();

    System.out.println("Model Name : " + myCar.model);
    System.out.println("Run?       : " + myCar.run);
    System.out.println("Speed!     : " + myCar.speed);
    System.out.println("Gear!      : " + myCar.gear);

  }
}

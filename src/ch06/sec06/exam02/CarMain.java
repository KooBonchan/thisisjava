package ch06.sec06.exam02;

public class CarMain {
  public static void main(String[] args) {
    Car myCar = new Car();

    System.out.println("Company    : " + myCar.company);
    System.out.println("Model Name : " + myCar.model);
    System.out.println("Car Color  : " + myCar.color);
    System.out.println("Run?       : " + myCar.maxSpeed);
    System.out.println("Speed!     : " + myCar.speed);
    System.out.println();

    myCar.speed = 60;
    System.out.println("Current color: " + myCar.speed);
  }
}

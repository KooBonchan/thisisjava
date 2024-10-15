package ch06.sec14;

public class Main {
  public static void main(String[] args) {
    Car car = new Car();
    car.setSpeed(-50);
    System.out.println("current speed: " + car.getSpeed());

    car.setSpeed(404);
    System.out.println("current speed: " + car.getSpeed());

    car.setStop(true);
    System.out.println("current speed: " + car.getSpeed());
  }
}

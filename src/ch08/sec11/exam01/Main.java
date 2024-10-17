package ch08.sec11.exam01;

public class Main {
  public static void main(String[] args) {
    Car car = new Car();

    car.run();
    System.out.println("------------------");

    car.setTire(2, new KumhoTire());
    car.setTire(3, new KumhoTire());

    car.run();
  }
}

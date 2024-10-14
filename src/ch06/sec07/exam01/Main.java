package ch06.sec07.exam01;

public class Main {
  public static void main(String[] args) {
    Car myKart = new Car();
    Car myCar = new Car("Damas", "White", 130);

    System.out.println("Model    : " + myCar.model);
    System.out.println("Color    : " + myCar.color);
    System.out.println("maxSpeed : " + myCar.maxSpeed);

  }
}

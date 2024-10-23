package ch13.sec02.exam01;

public class Main {
  public static void main(String[] args) {
    Product<TV, String> product1 = new Product<>(
      new TV(),
      "SmartTV");
    Product<Car, String> product2 = new Product<>(
      new Car(),
      "Huge Automobile Bass Guitar Case");


  }
}

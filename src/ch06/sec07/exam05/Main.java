package ch06.sec07.exam05;

public class Main {
  public static void main(String[] args) {
    Car car1 = new Car("Damas");
    car1.print();

    Car car2 = new Car("Matiz", "red");
    car2.print();

    Car car3 = new Car("Tico", "red", 150);
    car3.print();
  }
}

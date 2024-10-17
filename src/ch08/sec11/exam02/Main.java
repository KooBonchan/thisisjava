package ch08.sec11.exam02;

public class Main {
  public static void main(String[] args) {
    Driver driver = new Driver();

    Bus bus = new Bus();
    Taxi taxi = new Taxi();

    bus.checkFare();
    driver.drive(bus);

    driver.drive(taxi);
  }
}

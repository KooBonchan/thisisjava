package ch13.sec02.exam02;

public class Main {
  public static void main(String[] args) {
    CarAgency carAgency = new CarAgency();
    Car car = carAgency.rent();
    car.run();

    HomeAgency homeAgency = new HomeAgency();
    Home home = homeAgency.rent();
    home.turnOnLignt();
  }
}

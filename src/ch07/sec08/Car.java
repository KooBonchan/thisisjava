package ch07.sec08;

public class Car {
  Tire tire;

  public void setTire(Tire tire) {
    this.tire = tire;
  }

  public void run(){
    this.tire.roll();
  }
}

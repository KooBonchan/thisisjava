package ch08.sec02;

public class TV implements RemoteController{
  @Override
  public void turnOn() {
    System.out.println("TV O N");
  }

  @Override
  public void turnOff() {
    System.out.println("TV OfF");
  }
}

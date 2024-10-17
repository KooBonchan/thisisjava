package ch08.sec02;

public class Audio implements RemoteController{
  @Override
  public void turnOff() {
    System.out.println("Audio out");
  }

  @Override
  public void turnOn() {
    System.out.println("Audio on");
  }

  public Audio() {
  }
}
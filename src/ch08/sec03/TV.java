package ch08.sec03;

public class TV implements RemoteControl{
  private int volume = 0;
  @Override
  public void turnOn() {
    System.out.println("TV ON");
  }

  @Override
  public void turnOff() {
    System.out.println("TV OFF");
  }

  @Override
  public void setVolume(int volume) {
    System.out.println("Try set volume : " + volume);
    if(volume > RemoteControl.MAX_VOLUME) volume = RemoteControl.MAX_VOLUME;
    else if(volume < RemoteControl.MIN_VOLUME) volume = RemoteControl.MIN_VOLUME;
    this.volume = volume;
    System.out.println("Volume set to " + this.volume);
  }
}

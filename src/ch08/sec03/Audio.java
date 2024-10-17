package ch08.sec03;


public class Audio implements RemoteControl {
  private int volume = 0;
  @Override
  public void turnOn() {
    System.out.println("Audio ON");
  }

  @Override
  public void turnOff() {
    System.out.println("Audio OFF");
  }

  @Override
  public void setVolume(int volume) {
    System.out.println("Try set volume : " + volume);
    if(volume > RemoteControl.MAX_VOLUME) volume = RemoteControl.MAX_VOLUME;
    else if(volume < RemoteControl.MIN_VOLUME) volume = RemoteControl.MIN_VOLUME;
    this.volume = volume;
    System.out.println("Volume set to " + this.volume);
  }

  private int memVolume = 0;

  @Override
  public void setMute(boolean mute) {
    if( mute) memVolume = volume;
    RemoteControl.super.setMute(mute);
    if(!mute) volume = memVolume;
  }
}
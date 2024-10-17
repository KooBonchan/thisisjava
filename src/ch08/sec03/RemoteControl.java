package ch08.sec03;

import java.sql.SQLOutput;

interface RemoteControl {
  int MAX_VOLUME = 10;
  int MIN_VOLUME = 0;

  void turnOn();
  void turnOff();
  void setVolume(int volume);

  default void setMute(boolean mute){
    if(mute){
      System.out.println("Mute");
      this.setVolume(MIN_VOLUME);
    }
    else{
      System.out.println("Mute Out");
    }
  }
}

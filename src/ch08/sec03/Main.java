package ch08.sec03;

public class Main {
  public static void main(String[] args) {
    System.out.println("MAX VOLUME: "+ RemoteControl.MAX_VOLUME);
    System.out.println("MIN VOLUME: "+ RemoteControl.MIN_VOLUME);

    RemoteControl remoteControl = new TV();
    remoteControl.turnOn();
    remoteControl.setVolume(13);
    remoteControl.setVolume(7);
    remoteControl.setMute(true);
    remoteControl.turnOff();

    System.out.println("---------------------");

    remoteControl = new Audio();
    remoteControl.turnOn();
    remoteControl.setVolume(-32);
    remoteControl.setVolume(2);
    remoteControl.setMute(true);
    remoteControl.setVolume(6);
    remoteControl.setMute(false);
    remoteControl.turnOff();

  }
}

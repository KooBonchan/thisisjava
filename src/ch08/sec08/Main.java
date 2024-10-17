package ch08.sec08;

public class Main {


  public static void main(String[] args) {
    SuperTV tv = new SuperTV();
    RemoteControl remoteControl = tv;
    remoteControl.turnOn();
    remoteControl.turnOff();

    Searchable searchable = tv;
    searchable.search("Testttt");
  }
}

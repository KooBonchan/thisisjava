package ch08.sec08;

public class SuperTV implements RemoteControl, Searchable{
  @Override
  public void turnOn() {
    System.out.println("ON");
  }

  @Override
  public void turnOff() {
    System.out.println("OFF");
  }

  @Override
  public void search(String query) {
    System.out.println("No matching data for " + query);
  }
}

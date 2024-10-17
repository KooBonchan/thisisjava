package ch08.sec11.exam02;

public class Bus implements Vehicle{
  @Override
  public void run() {
    System.out.println("Bus run");
  }

  public void checkFare(){
    System.out.println("Check Fare");
  }
}

package ch09.sec07.exam02;

public class TV {
  private Logging log = System.out::println;
  TV(){}
  TV(Logging log){this.log = log;}

  private boolean power;
  void turnOn(){
    if(this.log != null) {
      log.log("Debug: Turn On");
    }
    power = true;
  }
  void turnOff(){
    if(this.log != null){
      log.log("Debug: Turn Off");
    }
    power = false;
  }
}

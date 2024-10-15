package ch07.sec02;

class SmartPhone extends Phone {
  boolean wifi;

  SmartPhone(String model, String color){
    super(model, color);
  }

  void setWifi(boolean wifi){
    this.wifi = wifi;
    System.out.println("Set Wifi: " + wifi);
  }

  void internet(){
    System.out.println("Internet");
  }
}

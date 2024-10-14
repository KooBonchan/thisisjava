package ch06.sec07.exam04;

public class Car {
  String company = "GM";
  String model;
  String color;
  int maxSpeed;

  Car(){}
  Car(String model){
    this.model = model;
  }
  Car(String model, String color){
    this.model = model;
    this.color = color;
  }
  Car(String model, String color, int maxSpeed){
    this.model = model;
    this.color = color;
    this.maxSpeed = maxSpeed;
  }

  void print(String name){
    System.out.println(name + "-Company : " + company);
    if(model != null){
      System.out.println(name + "-Model : " + model);
    }
    if(color != null){
      System.out.println(name + "-Color : " + color);
    }
    if(maxSpeed != 0){
      System.out.println(name + "-max speed: " + maxSpeed);
    }
    System.out.println();
  }
}

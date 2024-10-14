package ch06.sec07.exam01;

public class Car {

  String model;
  String color;
  int maxSpeed;

  Car(){
    this.model = "Starex";
    this.color = "Gray";
    this.maxSpeed = 250;
  }
  Car(String model, String color, int maxSpeed){
    this.model = model;
    this.color = color;
    this.maxSpeed = maxSpeed;
  }
}

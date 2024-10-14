package ch06.sec07.exam05;

public class Car {
  String company = "GM";
  String model;
  String color;
  int maxSpeed;

  String name;

  static int count = 1;

  Car(String model){this(model, "Silver", 250);}
  Car(String model, String color){this(model, color, 250);}

  Car(String model, String color, int maxSpeed){
    this.model = model;
    this.color = color;
    this.maxSpeed = maxSpeed;

    this.name = "Car" + count;
    count++;

  }

  void print(){
    System.out.println(name + ".company: " + company);
    System.out.println(name + ".model  : " + model);
    System.out.println(name + ".color  : " + color);
    System.out.println(name + ".speed  : " + maxSpeed);
    System.out.println();
  }
}

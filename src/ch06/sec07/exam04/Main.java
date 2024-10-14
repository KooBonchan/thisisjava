package ch06.sec07.exam04;

public class Main {
  public static void main(String[] args) {
    Car[] cars = new Car[4];
    cars[0] = new Car();
    cars[1] = new Car("Damas");
    cars[2] = new Car("Damas", "Red");
    cars[3] = new Car("Damas", "Black", 360);

    for(int i = 0; i < cars.length; i++){
      cars[i].print("car" + (i+1));
    }

  }
}

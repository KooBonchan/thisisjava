package ch09.sec07.exam01;

public class Car {
  Tire[] tires = new Tire[4];
  Car(){
    tires[0] = new Tire() {
      @Override
      void roll() {
        System.out.println("Blown out");
      }
    };
    for(int i = 1; i <4; i++){
      tires[i] = new Tire();
    }
  }

  void setTire(Tire tire, int index){
    if(index >= 0 && index < 4){
      tires[index] = tire;
    }
  }

  void run(){
    System.out.println("Car runs");
    for(int i = 0; i < 4; i++){
      System.out.printf("Tire%d: ", i+1);
      tires[i].roll();
    }
    System.out.println("-----------------");
  }
}
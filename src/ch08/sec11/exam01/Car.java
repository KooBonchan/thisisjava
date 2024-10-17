package ch08.sec11.exam01;

public class Car {
  private Tire[] tires = new Tire[4];

  Car(){
    this("Hankook");
  }
  Car(String company){
    if(company.equalsIgnoreCase("Hankook")){
      for(int i = 0; i < tires.length; i++){
        tires[i] = new HankookTire();
      }
    }
    else if (company.equalsIgnoreCase("Kumho")){
      for(int i = 0; i < tires.length; i++){
        tires[i] = new KumhoTire();
      }
    }
  }

  public void setTire(int i, Tire tire) {
    if(i >= 0 && i < this.tires.length){
      this.tires[i] = tire;
    }
  }

  public void run(){
    for(Tire t : tires){
      t.roll();
    }
  }
}

package ch07.sec02;

class Phone {
  String model;
  String color;
  Phone(String model, String color){
    this.model = model;
    this.color = color;
  }
  void bell(){
    System.out.println("Bell rings");
  }
  void message(String sender, String message){
    System.out.println(sender + ": " + message);
  }

  void hangUp(){
    System.out.println("Hang up");
  }
}

package ch06.sec15;

public class Main {
  public static void main(String[] args) {
//    Singleton singleton = new Singleton();
//    constructor is private -- singleton pattern.
    Singleton singleton = Singleton.getInstance();
    Singleton singletonton = Singleton.getInstance();

    System.out.println(singletonton == singleton);

  }
}

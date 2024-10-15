package ch06.sec15;

public class Singleton {
  private static Singleton singleton = new Singleton();
  //global 1 and only 1
  private Singleton(){}

  public static Singleton getInstance(){
    return singleton;
  }
}

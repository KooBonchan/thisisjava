package ch07.sec10;

public class Main {
  public static void main(String[] args) {
    Animal a1 = new Cat();
    Animal a2 = new Dog();

    a1.breath(()->{
      a1.sound();
      a2.sound();
    });

  }
}

package ch16.sec03;

public class Person {
  static String name = "Vincen Garcia";
  String job = "Cory Wong bassist";

  void work(Workable workable){
    workable.work(name, job);
  }
  void sayHello(Speakable speakable){
    speakable.speak("Hello");
  }
}

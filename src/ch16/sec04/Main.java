package ch16.sec04;

public class Main {
  public static void main(String[] args) {
    Person person = new Person();

    person.compute(Double::sum);

  }
}

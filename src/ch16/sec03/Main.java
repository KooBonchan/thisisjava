package ch16.sec03;

public class Main {
  public static void main(String[] args) {
    Person person = new Person();
    person.work((name, job)->{
      System.out.println("-----------------------");
      System.out.println(name.toUpperCase());
      System.out.println(job);
      System.out.println("-----------------------");
    });

    person.sayHello(string ->
      System.out.println(
        string
          .toUpperCase()
          .concat(" ").repeat(10)
          .trim()
          .concat("\n").repeat(6)
    ));
    person.sayHello(System.out::println);
  }
}

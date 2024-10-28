package Static;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<NoStaticPerson> noStatinoStaticPeople = new ArrayList<>();

    System.out.println("-----No Static-----------");
    for(int i = 0; i < 3; i++){
      NoStaticPerson person = new NoStaticPerson("Person" + i);
      noStatinoStaticPeople.add(person);
      System.out.println(person.getName() + " - " + person.getPopulation());
    }

    List<StaticPerson> staticPeople = new ArrayList<>();
    System.out.println("--------Static-----------");
    for(int i = 0; i < 3; i++){
      StaticPerson person = new StaticPerson("Static" + i);
      staticPeople.add(person);
      System.out.println(person.getName() + " - " + person.getPopulation());
    }

  }
}

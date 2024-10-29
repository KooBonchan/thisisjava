package ch17.sec05;

import java.util.ArrayList;
import java.util.List;

public class Filtering {
  public static void main(String[] args) {
    List<String> people = new ArrayList<>();

    people.add("Honggil");
    people.add("Shin");
    people.add("Shin");
    people.add("Shinhan");
    people.add("ShinD");

    people.stream()
      .distinct()
      .filter(p->p.startsWith("n",3))
      .mapToInt(String::length)
      .forEach(System.out::println);



  }
}

package ch17.sec07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Sort {
  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();
    students.add(new Student("Roland", 92));
    students.add(new Student("Daisy", 131));
    students.add(new Student("Skids", 100));

    students.stream()
      .sorted(Comparator.comparingInt(Student::getScore))
      .forEach(System.out::println);

    System.out.println();
    students.stream()
      .sorted(Comparator.reverseOrder())
      .forEach(System.out::println);

    long c = IntStream.rangeClosed(20,100)
      .filter(a->a%2==0)
      .sum();
    System.out.println(c);

  }
}

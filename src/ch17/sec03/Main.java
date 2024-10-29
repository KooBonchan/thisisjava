package ch17.sec03;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Random random = new Random();
    List<Student> students = new ArrayList<>();
    for(int i = 0; i < 1000; i++){
      students.add(new Student(
        String.format("Student %03d", i),
        random.nextInt(52,101)));
    }

    try(PrintWriter writer = new PrintWriter(System.out)) {
      students.stream().map(student -> String.format(
          "%s: %3d", student.getName(), student.getScore()))
        .collect(Collectors.groupingBy(i -> i.hashCode() / 10))
        .values()
        .forEach(group -> {
          writer.println(String.join(" | ", group));
        });
    }

    double avg = students.parallelStream()
      .mapToInt(Student::getScore)
      .average()
      .getAsDouble();

    System.out.println(avg);
  }
}

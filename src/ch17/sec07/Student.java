package ch17.sec07;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Student implements Comparable<Student>{
  private String name;
  private int score;

  @Builder
  public Student(String name, int score) {
    this.name = name;
    this.score = score;
  }

  @Override
  public int compareTo(Student o) {
    return Integer.compare(score, o.score);
  }

  @Override
  public String toString() {
    return "Student{" +
      "name='" + name + '\'' +
      ", score=" + score +
      '}';
  }
}

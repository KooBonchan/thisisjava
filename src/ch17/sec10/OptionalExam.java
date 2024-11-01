package ch17.sec10;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExam {
  public static void main(String[] args) {
    List<Integer> integerList = new ArrayList<>();

    OptionalDouble optional = integerList.stream()
      .mapToInt(e->e*10)
      .average();
    if(optional.isEmpty()){
      System.out.println("Using isEmpty/isPresent: " + "No element");
    }else{
      System.out.println("Using isEmpty/isPresent: "  + optional.getAsDouble());
    }

    double average = integerList.stream()
      .mapToDouble(e->Math.pow(e,1.3))
      .average()
      .orElse(0.1);

    System.out.println("Using orElse: " +average);


    System.out.print("Using ifPresent consumer: ");
    integerList.stream()
      .mapToDouble(Math::sqrt)
      .average()
      .ifPresent(System.out::println);


  }
}

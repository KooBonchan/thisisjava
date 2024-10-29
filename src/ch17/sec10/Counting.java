package ch17.sec10;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Counting {
  public static void main(String[] args) {
    IntStream.range(10,100)
      .map(i -> i * 3)
      .flatMap(i-> Arrays.stream(new int[]{i - 1, i + 4, -i}))
      .peek(System.out::println)
      .count();
    ;

  }
}

package ch17.sec01;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ParallelStream {
  public static void main(String[] args) {
    List<String> list =  new ArrayList<>();

    for(int i = 0; i < 100000; i++){
      list.add(String.format("Task %05d",i));
    }

    list.parallelStream()
      .map(n -> Thread.currentThread().getName())
      .collect(Collectors.toConcurrentMap(
        Function.identity(),
        (i) -> new AtomicInteger(1),
        (i, j) -> {i.addAndGet(j.get());return i;}
      ))
      .forEach((s, i) -> System.out.println(s + ": " + i));


  }
}

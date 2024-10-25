package ch15.sec02.exam03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<String> list1 = new ArrayList<>();
    List<String> list2 = new LinkedList<>();

    long startTime, endTime;

    startTime = System.currentTimeMillis();
    for(int i = 0; i < 100000; i++){
      list1.add(0,String.valueOf(i));
    }
    endTime = System.currentTimeMillis();
    System.out.println("List1 time : " + (endTime - startTime) + "ms");
    list1 = null;


    startTime = System.currentTimeMillis();
    for(int i = 0; i < 100000; i++){
      list2.add(0,String.valueOf(i));
    }
    endTime = System.currentTimeMillis();
    System.out.println("List2 time : " + (endTime - startTime) + "ms");


  }
}

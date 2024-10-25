package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    Map<String, Integer> map = new HashMap<>();

    map.put("Baekjoon", 99);
    map.put("Docker"  , 85);
    map.put("Kraken"  , 23);
    map.put("AcmICPC" , 97);
    map.put("Baekjoon", 00);
    System.out.println("Total Entry(s): " + map.size());
    System.out.println();


    long t1 = System.nanoTime();
    for(String key : map.keySet()){
      System.out.printf("%-10s : %02d\n", key, map.get(key));
    }
    t1 = System.nanoTime() - t1;
    System.out.println("Time1 : "+t1);

    System.out.println();
    long t2 = System.nanoTime();
    for(Map.Entry<String, Integer> entry : map.entrySet()){
      System.out.printf("%-10s : %02d\n", entry.getKey(), entry.getValue());
    }
    t2 = System.nanoTime() - t2;
    System.out.println("Time2 : "+t2);

    System.out.println();
    map.remove("Kraken");
    System.out.println("Total Entry(s): " + map.size());

  }
}

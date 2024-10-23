package ch12.sec04;

public class timelog {
  public static void main(String[] args) {
    long time1 = System.nanoTime();

    long sum = 0;
    for(int i = 1; i < Integer.MAX_VALUE; i++){
      sum += i;
    }
    sum += Integer.MAX_VALUE;
//    long sum = ((Integer.MAX_VALUE - 1) / 2 + 1) * (long)Integer.MAX_VALUE; --> 200ns! O(1) crazy good

    long time2 = System.nanoTime();
    System.out.println("Sum of all positive INT:" + sum);
    System.out.println("Total time(ns): " + (time2 - time1));

  }
}

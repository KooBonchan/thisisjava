package ch06.sec08.exam02;

public class Main {
  public static void main(String[] args) {
    Computer computer = new Computer();
    System.out.println("Result 1: " + computer.sum(1,2,3,4,555));
    System.out.println("Result 2: " + computer.sum(1,2,3));
    // variable length parameter
    System.out.println("Result 3: " + computer.sum(new int [] {1,2,3,4,555}));
    // is internally implemented by array
    int[] values = {1,2,3,4,555};
    System.out.println("Result 4: " + computer.sum(values));
    // no array initializer for parameter ==> memory allocation issue?


  }
}

package ch02.sec02;

public class TypeRange {
  public static void main(String[] args) {
    int i = Integer.MIN_VALUE;
    int j = Integer.MIN_VALUE;

    System.out.printf("i : %d\t\t j : %d\n", i, j);
    System.out.println("\t\t\t\t\ti + j : " + ((long)i + j));
  }
}

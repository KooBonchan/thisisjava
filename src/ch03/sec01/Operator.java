package ch03.sec01;

public class Operator {
  public static void main(String[] args) {
    int a = 5; int b = 3;

//    int c = ++a + b++;
    ++a;b++; int c = a + b;
    System.out.printf("%d %d %d", a, b, c);

  }
}

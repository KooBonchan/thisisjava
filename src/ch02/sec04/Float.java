package ch02.sec04;

public class Float {

  public static void main(String[] args) {
    float v1 = 0.123456789123456789f;
    double v2 = 0.123456789123456789;
    System.out.println("v1: " + v1);
    System.out.println("v2: " + v2);

    double v3 = 3e6;
    float v4 = 3e6f;
    double v5 = 2e-3;

    System.out.println("v3: " + v3);
    System.out.println("v4: " + v4);
    System.out.println("v5: " + v5);
  }
}

package ch03.sec09;

public class Shift {
  public static void main(String[] args) {
    int num = 0x101; //5
    int neg = -117;

    System.out.printf("%d %1$x\n", num << 3);
    System.out.printf("%d %1$x\n", (int)Math.pow(2,3)*num);
    System.out.printf("%d %1$x\n", neg);
    System.out.printf("%d %1$x\n", neg >> 3);
    System.out.printf("%d %1$x\n", neg >>> 3);
  }
}

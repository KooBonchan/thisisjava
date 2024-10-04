package ch03.sec03;

public class OverUnderFlow {
  public static void main(String[] args) {
    byte var1 = 126;
    for(byte i = 0; i < 5; i++,var1++){
      System.out.printf("Byte var1: %d\n", var1);
    }

    System.out.println("---------------------");

    byte var2 = -126;
    for(byte i = 0; i < 5; i++,var2--){
      System.out.printf("Byte var2: %d\n", var2);
    }
  }
}

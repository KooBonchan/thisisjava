package ch06.sec08.exam01;

public class Main{
  public static void main(String[] args) throws Exception{
    Calculator calculator = new Calculator();

    calculator.powerOn();

    int x = 10, y = 4;
    System.out.println("Result1: " + calculator.plus(x, y));
    System.out.println("Result2: " + calculator.divide(x, y));

    calculator.powerOff();
  }
}

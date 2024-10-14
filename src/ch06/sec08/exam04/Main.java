package ch06.sec08.exam04;

public class Main {


  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    double result1 = calculator.areaRectangle(10);
    double result3 = calculator.areaRectangle(13);
    double result2 = calculator.areaRectangle(100, 200);

    System.out.println("Square : " + result1);
    System.out.println("Rectangle : " + result2);
    System.out.println("Square : " + result3);

  }
}

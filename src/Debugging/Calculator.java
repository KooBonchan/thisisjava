package Debugging;

public class Calculator {

  public int add(int a, int b) {
    return a + b;
  }

  public int subtract(int a, int b) {
    return a - b;
  }

  public int multiply(int a, int b) {
    return a * b;
  }

  public double divide(int a, int b) {
    if(b != 0)
      return a / (double)b; // 버그: 0으로 나누는 경우 처리 필요
    return 0;
  }

  public int modulus(int a, int b) {
    if(b!=0)return a % b;
    return 0;
  }

  public void complexOperation(int a, int b) {
    int sum = add(a, b);
    int diff = subtract(a, b);
    int prod = multiply(a, b);
    double quot = divide(a, b);
    int mod = modulus(a, b);

    String resultString = "Results: " + sum + ", " + diff + ", " + prod + ", " + quot + ", " + mod;

    // 비정상적인 조건으로 인한 무한 루프
    for (int i = 0; i < 5; i--) {
      System.out.println(resultString);
      // 루프 조건이 항상 true로 설정됨
      if (i == 5) break; // 이 조건은 결코 참이 될 수 없음
    }
  }


  public static void main(String[] args) {
    Calculator calc = new Calculator();
    System.out.println(calc.add(5, 3));         // 8
    System.out.println(calc.subtract(5, 3));    // 2
    System.out.println(calc.multiply(5, 3));     // 15
    System.out.println(calc.divide(5, 0));       // 버그 발생
    System.out.println(calc.modulus(5, 2));      // 1

    calc.complexOperation(5, 0);
  }
}

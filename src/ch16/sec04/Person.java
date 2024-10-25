package ch16.sec04;

public class Person {
  public void compute(Calculable calculable){
    System.out.println("Result: " + calculable.calc(10,3));
  }
}

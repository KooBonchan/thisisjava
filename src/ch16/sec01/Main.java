package ch16.sec01;

public class Main {
  static void action(Calculable calculable){
    action(calculable, 10.22, Math.PI);
  }
  static void action(Calculable calculable, double x, double y){
    System.out.println("result : " + calculable.calc(x, y));
  }
  public static void main(String[] args) {
    action(Math::pow);
    action(Double::sum);
  }
}

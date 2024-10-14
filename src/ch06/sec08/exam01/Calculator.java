package ch06.sec08.exam01;

public class Calculator {
  private boolean power = false;

  void powerOn(){
    power = true;
    System.out.println("Calculator on");
  }
  void powerOff(){
    power = false;
    System.out.println("Calculator off");
  }

  int plus(int x, int y) throws NoSuchMethodException{
    if(!power){
      throw new NoSuchMethodException("Must Power On first");
    }
    return x + y;
  }
  double divide(int x, int y) throws NoSuchMethodException, ArithmeticException{
    if(!power){
      throw new NoSuchMethodException("Must Power On first");
    }
    if(y == 0) {
      throw new ArithmeticException("Zero Division");
    }
    return (double) x / y;
  }
}

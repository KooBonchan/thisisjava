package ch07.sec04;

public class Computer extends Calculator{
  @Override
  double areaCircle(double r) {
    super.areaCircle(r);
    return Math.PI * r * r;
  }
}

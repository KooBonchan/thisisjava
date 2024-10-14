package ch06.sec08.exam04;

public class Calculator {
  double areaRectangle(double edge){
    return this.areaRectangle(edge, edge);
  }
  double areaRectangle(double width, double height){
    return width * height;
  }
}

package ch02.sec12;

public class FormattedString {
  public static void main(String[] args) {
    String name = "Koo";
    int age = 27;
    String position = "DB";

    System.out.printf("Name: %s  Age: %3d Position: %s\n", name, age, position);

    int preAge = 3;
    System.out.printf("Current age: %3d\n",age);
    System.out.printf("Previous age:%3d\n",preAge);

    double rate = 34.3445672;
    System.out.println("Rate: " + rate);
    System.out.printf("Rate: %10.2f\n",rate);
  }

}

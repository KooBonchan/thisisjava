package ch06.sec11.exam01;

public class Main {
  public static void main(String[] args) {
    Korean korean = new Korean("001122-3456789", "Error Neus");
    System.out.println(korean.nation);
    System.out.println(korean.name);
    System.out.println(korean.ssn);

//    final value: first initialization is the last assignment
//    korean.nation = "Nth Korea";
//    korean.ssn = "sssff";
  }
}

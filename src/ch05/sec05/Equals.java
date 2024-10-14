package ch05.sec05;

public class Equals {
  public static void main(String[] args) {
    String str1 = "TSquare";
    String str2 = "TSquare"; // Java internal implementation --> str1 == str2 since two strings are identical.

    System.out.println("str1 == str2      - Should be True:  " + (str1 == str2));
    System.out.println("str1.equals(str2) - Should be True:  " + str1.equals(str2));

    String str3 = new String(str1);
    String str4 = new String(str1); // Force allocation.

    System.out.println("str3 == str4      - Should be False: " + (str3 == str4));
    System.out.println("str3.equals(str4) - Should be True:  " + str3.equals(str4));


  }
}

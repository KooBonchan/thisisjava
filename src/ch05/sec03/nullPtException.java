package ch05.sec03;

public class nullPtException {
  public static void main(String[] args) {
    int [] arr = null;
//    arr[0] = 10; // nullPointerException

//    String str = null;
    String str = "string";
    System.out.println("Num of Chars: " + str.length());
  }
}

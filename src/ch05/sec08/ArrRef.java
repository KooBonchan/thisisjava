package ch05.sec08;

public class ArrRef {
  public static void main(String[] args) {
    String[] arr = new String[3];
    arr[0] = "java";
    arr[1] = "java";
    arr[2] = new String("java");

    System.out.println("arr[0] == arr[1]? :" + (arr[0] == arr[1]));
    System.out.println("arr[0] == arr[2]? :" + (arr[0] == arr[2]));
    System.out.println("arr[0] equals arr[1]? :" + arr[0].equals(arr[2]));

  }
}

package ch05.sec03;

public class ReferenceVariableComparison {
  public static void main(String[] args) {
    int[] arr1 = {1,2,3};
    int[] arr2 = {1,2,3};
    int[] arr3 = arr2;

    System.out.println(arr1 == arr2);
    System.out.println(arr2 == arr3);
  }

}

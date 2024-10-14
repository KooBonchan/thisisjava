package ch05.sec06;

public class arrayAssignment {
  public static void main(String[] args) {
    String[] season = {"Spring", "Summer", "Fall", "Winter"};

    int[] scores = { 83, 90, 87};
    int sum = 0;
    for(int score : scores){
      sum += score;
    }
    System.out.println("Sum : " + sum);
    System.out.println("Avg : " + (sum / (float)scores.length));
    printItem(new int[] {83, 83, 99, 22, 11});
  }

  private static void printItem(int[] scores){
    for(int i = 0; i < scores.length; i++){
      System.out.printf("Array [%d]: %d\n", i, scores[i]);
    }
  }
}

package ch05.sec06;

public class Array2D {
  public static void main(String[] args) {
    int[][] scores = {
      {1, 3, 33},
      {44, 98}
    };
    System.out.println("length of scores   : " + scores.length);
    System.out.println("length of scores[0]: " + scores[0].length);
    System.out.println("length of scores[1]: " + scores[1].length);

    System.out.println("Sample 1 - scores[0][2]: " + scores[0][2]);
    System.out.println("Sample 2 - scores[1][1]: " + scores[1][1]);
    System.out.println();

    int total = 0, totalStudent = 0;
    for(int i = 0; i < scores.length; i++){
      int subTotal = 0;
      for(int score : scores[i]){
        subTotal += score;
      }
      total += subTotal;
      totalStudent += scores[i].length;
      if(scores[i].length > 0){
        System.out.printf("Avg of class %d: %.2f\n", i+1, (float)subTotal / scores.length);
      }
    }

    if(totalStudent != 0){
      System.out.printf("Total Avg     : %.2f\n", (float) total / totalStudent);
    } else{
      System.out.println("No student!");
    }
  }
}

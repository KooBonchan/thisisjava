package ch03.sec11;

public class ThreeCondi {
  public static void main(String[] args) {
    int score = 55;
    char grade;
//    if(score>90) grade = 'A';
//    else grade = 'B';

    grade = (score > 90) ? 'A' : 'B';
    System.out.printf("%d : %c grade", score, grade);
  }
}

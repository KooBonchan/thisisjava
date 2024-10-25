package ch15.sec05.exam01;

import java.util.Random;
import java.util.TreeSet;

public class BST1 {
  public static void main(String[] args) {
    TreeSet<Integer> scores = new TreeSet<>();
    Random random = new Random();

    for(int i = 0; i < 10; i++){
      scores.add(random.nextInt(70,101));
    }
    for(int score : scores) System.out.print(score + " ");
    System.out.println();
    System.out.println();

    System.out.println("Lowest         : " + scores.first()         );
    System.out.println("Highest        : " + scores.last ()         );
    System.out.println("Right before 95: " + scores.lower(95)    );
    System.out.println("Right above  95: " + scores.higher(95)      );
    System.out.println("<= 95          : " + scores.floor(95)       );
    System.out.println(">= 85          : " + scores.ceiling(85) );


    for(Integer s : scores.descendingSet()) System.out.print(s + " ");
    System.out.println();
    System.out.println();


    for(Integer s : scores.subSet(80, true, 90, false)){
      System.out.print(s + " ");
    }
  }
}

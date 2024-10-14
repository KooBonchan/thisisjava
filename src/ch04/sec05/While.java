package ch04.sec05;

public class While {
  public static void main(String[] args) {
    int i = 0;
    while(i < 10) System.out.print(++i + " ");
    System.out.println();

    int j = 0, sum = 0;
    while(j < 10) sum += ++j;
    System.out.println("sum: " + sum);
  }
}

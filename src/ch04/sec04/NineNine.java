package ch04.sec04;

public class NineNine {
  public static void main(String[] args) {
    int min = 1, max = 9, cut = 4;

    int current = 2;
    while(current <= max){
      for(int i = min; i <= max; i++){

        for(int j = current;
            j <= Math.min(current + cut - 1, max);
            j++){
          System.out.printf("%d * %d = %2d\t\t",j,i,j*i);
        }
        System.out.println();
      }
      System.out.println();
      current += cut;
    }

  }
}

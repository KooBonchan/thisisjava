package ch03.sec05;

public class InfNaNTest {
  public static void main(String[] args) {
    int x = 5;
    double y = 0.0;

    double z = x % y;
//    System.out.println(z + 2);

    if(Double.isInfinite(z) || Double.isNaN(z)){
      System.out.println("cannot calc");
    } else{
      System.out.println(z + 2);
    }


  }
}

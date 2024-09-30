package ch02.sec05;

public class Boolean {

  public static void main(String[] args) {
//    boolean stolp = 7;
    boolean stop = false;
    if(stop) System.out.println("stop");
    else System.out.println("start");

    int x = 10;
    boolean r1 = x == 20;
    boolean r2 = x != 20;


    System.out.println("r1: "+r1+", r2: " + r2);
    System.out.println("&&:" + (r1 && r2));
    System.out.println("||:" + (r1 || r2));
    System.out.println("==:" + (r1 == r2));
    System.out.println("!=:" + (r1 != r2));



  }
}

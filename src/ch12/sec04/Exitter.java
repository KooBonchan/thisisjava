package ch12.sec04;

public class Exitter {
  public static void main(String[] args) {
    for(int i = 0; i < 10; i++){
      System.out.println(i);
      if (i == 5){
        System.err.println("Error occurred");
        System.exit(-1);
      }
    }
  }
}

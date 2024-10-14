package ch05.sec05;

public class split {
  public static void main(String[] args) {
    String board = "1,Java,String is Reference Type.,Koo";

    String[] token = board.split(","); // regex!

    System.out.println("Index   : " + token[0]);
    System.out.println("Title   : " + token[1]);
    System.out.println("Content : " + token[2]);
    System.out.println("Name    : " + token[3]);

    for(int i = 0; i < token.length; i++){
      System.out.println(token[i]);
    }
  }
}

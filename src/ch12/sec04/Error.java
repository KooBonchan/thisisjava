package ch12.sec04;

public class Error {
  public static void main(String[] args) {
    try{
      int value = Integer.parseInt("1oi");
    }catch(NumberFormatException e){
      System.out.println("Error");
      System.err.println("[Error]");
      System.err.println(e.getMessage());
    }
  }
}

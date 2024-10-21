package ch11.sec05;

public class exceptionThrows {

  public static void findClass() throws ClassNotFoundException{
    Class.forName("java.lang.ScreamIce");
  }
  public static void main(String[] args) {
    try{
      findClass();
    } catch (ClassNotFoundException e) {
      System.out.println("Exception: " + e.getMessage());
    }
  }
}

package ch11.sec05;

public class exceptionThrows2 {

  public static void findClass() throws ClassNotFoundException{
    Class.forName("java.lang.ScreamIce");
  }
  public static void main(String[] args) throws Exception{
    findClass();
  }
}

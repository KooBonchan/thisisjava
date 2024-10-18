package ch11.sec02.exam01;

public class Main {

  public static void errorMessageFormat(String s){
    System.out.println("-------------------------");
    System.out.println("Alert: Error occurred");
    System.out.println(s);
    System.out.println("-------------------------");
  }

  public static void printLength(String data){
    try{
      int result = data.length();
      System.out.println("Length: " + result);

      Class.forName("java.lang.String");
      System.out.println("String class exists");
    }
    catch (ClassNotFoundException e){
      errorMessageFormat("No such class implemented");
    }
    catch (NullPointerException e){
      errorMessageFormat("No message");
    }
    catch (Exception e){
      errorMessageFormat("What error?\n" + e.getMessage());
    }

  }

  public static void main(String[] args) {
    System.out.println("[Program Run]");
    printLength("String");
    printLength(null);
    System.out.println("[Program Halt]");
  }
}

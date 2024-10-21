package ch11.sec06;


public class Main {
  public static void main(String[] args) {

    Account account = new Account(51000);
    System.out.println("Balance: " + account.getBalance());

    try{
      account.withdraw(40000 );
    } catch (InsufficientException e) {
      String message = e.getMessage();
      System.out.println(message);

    }
  }
}

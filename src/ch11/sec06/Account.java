package ch11.sec06;

public class Account {
  private long balance;
  public Account(){}

  public Account(long balance) {
    if(balance > 0){
      this.balance = balance;
    }
  }

  public long getBalance() {
    return balance;
  }
  public void deposit(int money){
    if(money > 0){
      balance += money;
    }
  }

  public void withdraw(int money) throws InsufficientException{
    if (balance < money){
      throw new InsufficientException("Not enough mineral: " + (money - balance));
    }
    balance -= money;
  }
}

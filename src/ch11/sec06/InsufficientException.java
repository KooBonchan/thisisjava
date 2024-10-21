package ch11.sec06;

public class InsufficientException extends RuntimeException{
  public InsufficientException(){}
  public InsufficientException(String message){
    super(message);
  }
}

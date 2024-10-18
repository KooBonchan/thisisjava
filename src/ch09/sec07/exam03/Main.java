package ch09.sec07.exam03;

public class Main {
  public static void main(String[] args) {
    Button button = new Button();
    button.setClickListener(()-> System.out.println("Me Button"));
    button.click();
  }
}

package ch03.sec07;

public class LogicAndBit {

  public static void main(String[] args) {
    int i = 0b11001010;
    int j = 0b00001011;

    System.out.println("Logic: " + (i == 2 && j == 5));
    System.out.println("Bit:   " + (i & j));
  }
}

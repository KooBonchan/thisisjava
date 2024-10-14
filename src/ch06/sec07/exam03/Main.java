package ch06.sec07.exam03;

public class Main {
  public static void main(String[] args) {
    Korean kor1 = new Korean("Baek");
    Korean kor2 = new Korean("Joon", "210123-4567890 ");

    System.out.println("1st person: " + kor1.name);
    System.out.println("2nd person: " + kor2.name);
    System.out.println("       ssn: " + kor2.ssn);

  }
}

package ch05.sec03;

public class GarbageMakerKoo {
  public static void main(String[] args) {
    String hobby = "Bass";
    hobby = null; // --> hobby be garbage

    String kind1 = "Kart";
    String kind2 = kind1; //shares referece
    System.out.println(kind1 == kind2);
    kind1 = null; // Kart not garbage, kind2 still referencing it.
    System.out.println("Kind2 : " + kind2);

  }
}

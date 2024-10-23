package ch13.sec03.exam01;

public class Main {
  public static <T> Box<T> boxing(T t){
    Box<T> box = new Box<T>();
    box.setT(t);
    return box;
  }

  public static <T extends Number, U extends Number> boolean compare(T n1, U n2){
    System.out.printf("Compare(%s,%s)\n",
      n1.getClass().getSimpleName(),
      n2.getClass().getSimpleName());
    double d1 = n1.doubleValue();
    double d2 = n2.doubleValue();
    return d1 == d2;
  }

  public static void main(String[] args) {
    Box<Integer> box = boxing(100);
    System.out.println(box.getT());

    Box<String> stringBox = boxing("document");
    System.out.println(stringBox);

    boolean result1 = compare(10,20);
    System.out.println(result1);

    boolean result2 = compare(4,4.0);
    System.out.println(result2);
  }
}

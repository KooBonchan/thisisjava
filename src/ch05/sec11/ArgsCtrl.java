package ch05.sec11;

public class ArgsCtrl {
  public static void main(String[] args) {
    if(args.length != 3){
      System.out.println("Usage: java ArgsCtrl numberA numberB numberC");
      System.exit(0);
    }

    try{
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      int c = Integer.parseInt(args[2]);
      System.out.printf("%d + %d + %d = %d\n", a, b, c, (long)a+b+c);
    }catch (NumberFormatException e){
      System.out.println("Usage: java ArgsCtrl numberA numberB numberC");
      System.out.println("Please use integer (in range -2,000,000,000 ~ 2,000,000,000)");
      System.exit(1);
    }
  }
}

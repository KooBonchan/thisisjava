package Lambda.Test;


public class Lambda {
  public static void main(String[] args) {
    Workable w = Math::max;
    System.out.println(w.work(31,333));
  }
}

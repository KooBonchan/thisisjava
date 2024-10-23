package ch13.sec01;

import java.util.ArrayDeque;
import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Box<String> box = new Box<>();
    box.content = "String Box";
    System.out.println(box.content);

    Box<Integer> box2 = new Box<>();
    box2.content = 11222;
    System.out.println(box2.content);
  }
}

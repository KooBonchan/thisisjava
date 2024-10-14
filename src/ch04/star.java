package ch04;

import java.util.Scanner;

public class star {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Types");
    System.out.println("2:▲ 3:◆");
    System.out.print("Type: ");int type = scanner.nextInt();
    System.out.print("size: ");int n = scanner.nextInt();

    StringBuilder stringBuilder = new StringBuilder();
    switch(type){
      case 1:
        rightTriangle(stringBuilder, n);
        break;
      case 2:
        isoscelesTriangle(stringBuilder, n);
        break;
      case 3:
        square(stringBuilder, n);
        break;
      default:
        System.out.println("Restart program");
        return;
    }
    System.out.println(stringBuilder);
  }

  static void rightTriangle(StringBuilder sb, int size){

    for(int i = 0; i < size; i++){
      for(int j = 0; j < size; j++){
        if(j + i < size-1) sb.append(' ');
        else sb.append('*');
      }
      sb.append('\n');
    }
  }
  static void isoscelesTriangle(StringBuilder sb, int size){
    for(int i = 0; i < size; i++){
      for(int j = i+1; j < size; j++){
        sb.append(' ');
      }
      for(int j = 0 ; j < 2 * i + 1; j++){
        sb.append('*');
      }
      sb.append('\n');
    }
  }
  static void square(StringBuilder sb, int size){
    for(int i = 0; i < size; i++){
      for(int j = i+1; j < size; j++){
        sb.append(' ');
      }
      for(int j = 0 ; j < 2 * i + 1; j++){
        sb.append('*');
      }
      sb.append('\n');
    }
    for(int i = size-2; i >= 0; i--){
      for(int j = i+1; j < size; j++){
        sb.append(' ');
      }
      for(int j = 0 ; j < 2 * i + 1; j++){
        sb.append('*');
      }
      sb.append('\n');
    }
  }


}

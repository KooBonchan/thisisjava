package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    List<Board> boards = new ArrayList<>();


    for(int i = 1; i <= 5; i ++){
      boards.add(new Board("Title" + i,
                           "Content" + i + i,
                           "Writer" + i + i));
    }


    final int CONTENT_WIDTH = boards.get(0).toString().length();

    System.out.println("Total size: " + boards.size());
    System.out.println("-".repeat(CONTENT_WIDTH));

    System.out.println(boards.get(2));
    System.out.println("-".repeat(CONTENT_WIDTH));

    for(Board board : boards){
      System.out.println(board);
    }

    boards.remove(4);
    boards.remove(2);
    System.out.println("-".repeat(CONTENT_WIDTH));

    for(Board board : boards){
      System.out.println(board);
    }

  }
}

package ch18.sec04;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
  public static void main(String[] args) {
    try(java.io.Writer writer = new FileWriter("c:/temp/test.txt")){
      writer.write('a');
      writer.write('B');
      writer.write(new char[] {'C','D','e'});
      writer.write("FGH");
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}

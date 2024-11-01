package ch18.sec04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class ReaderExam {
  public static void main(String[] args) {
    try (Reader reader = new FileReader("c:/temp/test.txt")){
      while(true){
        int data = reader.read();
        if(data == -1) break;
        System.out.println((char)data);
      }

    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    try (Reader reader = new FileReader("c:/temp/test.txt")){
      char[] buffer = new char[100];
      while(true){
        int data = reader.read(buffer, 3, 80);
        if(data == -1) break;
        System.out.println(Arrays.toString(buffer));
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}

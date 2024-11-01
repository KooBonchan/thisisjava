package ch18.sec03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Reader {
  public static void main(String[] args) {
    try(InputStream inputStream = new FileInputStream("C:/Temp/test1.db")){
      byte[] buffer = new byte[100];
      while(true){
        int data = inputStream.read(buffer, 5, 3);
        if(data == -1) break;
        System.out.println(Arrays.toString(buffer));
      }
    } catch (FileNotFoundException e) {
      System.out.println("File not found: " + e.getMessage());
    } catch (IOException e) {
      System.out.println("Error occurred while reading file" + e.getMessage());
    }
  }
}

package ch18.sec07;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineExample {
  public static void main(String[] args) {
    final String FILEPATH = "src/ch18/sec07/ReadLineExample.java";
    try(FileReader fileReader = new FileReader(FILEPATH);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
    ) {
      int lineNo = 1;
      while(true){
        String str = bufferedReader.readLine();
        if(str == null) break;
        System.out.println(lineNo + "\t" + str);
        lineNo++;
      }
    } catch (FileNotFoundException e) {
      System.out.println("No such file");
    } catch (IOException e) {
      System.out.println("IO Exception: " + e.getMessage());
    }


  }
}

package ch18.sec09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class FilePrintStreaming {
  public static void main(String[] args) {
    try(
      FileOutputStream fileOutputStream = new FileOutputStream("C:/Temp/printstream.txt");
      PrintStream printStream = new PrintStream(fileOutputStream)
    ){
      printStream.print("print as if using sout\n");
      String[][] block = {
        {"1", "Rex Murphy", "Reporter"},
        {"2", "Zoey Samaras", "Chef"}
      };
      for(String[] line : block){
        printStream.printf("| %6s | %-20s | %10s |\n", line[0], line[1], line[2]);
      }



    } catch (FileNotFoundException e) {
      System.out.println("Cannot use such filepath");
    } catch (IOException e) {
      System.out.println("IO Exception: " + e.getMessage());
    }

  }
}

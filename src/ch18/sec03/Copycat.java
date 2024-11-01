package ch18.sec03;

import java.io.*;

public class Copycat {
  public static void main(String[] args) {
    String originalFilename = "c:/temp/testImage.png";
    String targetFilename = "c:/temp/testImage-copy.png";
    try(InputStream inputStream = new FileInputStream(originalFilename);
        OutputStream outputStream = new FileOutputStream(targetFilename)){
      byte[] buffer = new byte[1024];
      while(true){
        int num = inputStream.read(buffer);
        if(num == -1){
          outputStream.flush();
          break;
        }
        outputStream.write(buffer, 0, num);
      }

//      From java 9: connect istream to ostream
//      inputStream.transferTo(outputStream);

    } catch (FileNotFoundException e) {
      System.out.println("No such file");
    } catch (IOException e) {
      System.out.println("Error while file IO");
    }


  }
}

package ch18.sec07;

import java.io.*;

public class Buffering {
  public static void main(String[] args) throws NullPointerException, FileNotFoundException {
    String originalFilePath1 =
      Buffering.class.getResource("originalFile1.jpg").getPath();
    String targetFilePath1 = "C:/Temp/targetFile1.jpg";
    String originalFilePath2 =
      Buffering.class.getResource("originalFile2.jpg").getPath();
    String targetFilePath2 = "C:/Temp/targetFile2.jpg";

    try (FileInputStream fileInputStream = new FileInputStream(originalFilePath1);
         FileOutputStream fileOutputStream = new FileOutputStream(targetFilePath1);
    ) {
      System.out.printf("No Buffer:%12d ns\n", copyTimeCheck(fileInputStream,fileOutputStream));

    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    try (FileInputStream fileInputStream = new FileInputStream(originalFilePath2);
         FileOutputStream fileOutputStream = new FileOutputStream(targetFilePath2);
         BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
         BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream)
    ) {
      System.out.printf("w/ Buffer:%12d ns\n", copyTimeCheck(bufferedInputStream,bufferedOutputStream));
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

  }
  public static long copyTimeCheck(InputStream inputStream, OutputStream outputStream) throws IOException{
    long start = System.nanoTime();

    while(true){
      int data = inputStream.read();
      if(data == -1) break;
      outputStream.write(data);
    }
    outputStream.flush();

    long end = System.nanoTime();
    return end - start;
  }
}

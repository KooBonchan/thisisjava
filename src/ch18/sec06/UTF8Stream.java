package ch18.sec06;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class UTF8Stream {
  public static void main(String[] args) throws IOException {
    write("한국어中國語");
    String data = read();
    System.out.println(data);
  }

  public static void write(String string) throws IOException{
    OutputStream outputStream = new FileOutputStream("C:/temp/test.txt");
    Writer writer = new OutputStreamWriter(outputStream, StandardCharsets.UTF_8);
    writer.write(string);
    writer.flush();
    writer.close();
  }
  public static String read() throws IOException{
    InputStream inputStream = new FileInputStream("c:/temp/test.txt");
    Reader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);

    char[] data = new char[1024];
    int num = reader.read(data);
    reader.close();
    return new String(data, 0, num);
  }
}
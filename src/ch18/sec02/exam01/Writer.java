package ch18.sec02.exam01;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Writer {
  public static void main(String[] args) {
    Path directory =  Paths.get("c:/temp");
    Path filePath = directory.resolve("test1.db");

    try{
      //if no dir, error on file creation
      if(!Files.exists(directory)) Files.createDirectories(directory);

      try(OutputStream outputStream = new FileOutputStream(filePath.toFile())){


//        outputStream.write(99);outputStream.write(100);outputStream.write(101);
        byte[] a = {65,66,67,68,69};
        outputStream.write(a);


//      automatically flushes when closing try
//      outputStream.flush();
//      outputStream.close();
      } catch(IOException e){
        System.out.println("File writing: " + e.getMessage());
      }

    } catch(IOException e){
      // bound to directory creation
      System.out.println("Directory creation: "+e.getMessage());
    }

  }
}

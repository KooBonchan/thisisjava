package ch18.sec11;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileCreator {
  public static void main(String[] args) throws IOException {
    File dir = new File("c:/temp/images");
    String fileDir = "c:/temp/";
    if( ! dir.exists()) dir.mkdirs();

    File[] files = new File[3];
    for(int i = 0; i < files.length; i++){
      File file = new File(fileDir + "file" +i + ".txt");
      if( ! file.exists()) file.createNewFile();
    }

    File temp = new File("C:/temp");
    File[] contents = temp.listFiles();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd HH:mm:ss");

    if(contents != null){
      for(File file : contents){
        String length = file.isDirectory() ? "<DIR>" : String.valueOf(file.length());
        System.out.printf(
          "%-25s%-10s%-20s\n",
          simpleDateFormat.format(new Date(file.lastModified())),
          length,
          file.getName());
      }
    }
  }
}

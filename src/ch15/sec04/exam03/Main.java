package ch15.sec04.exam03;

import java.io.IOException;
import java.util.Properties;

public class Main {
  public static void main(String[] args) throws IOException {
    Properties properties = new Properties();


    properties.load(Main.class.getResourceAsStream("database.properties"));

    for (String key : properties.stringPropertyNames()){
      System.out.println(key + " : " + properties.getProperty(key));
    }
  }
}

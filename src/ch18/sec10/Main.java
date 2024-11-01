package ch18.sec10;

import java.io.*;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    final String path = "c:/temp/object.dat";
    try(
      FileOutputStream fileOutputStream = new FileOutputStream(path);
      ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)
    ){
      Member member = new Member("Davide", "Biale");
      Product product = new Product("Hollow Body", 2500000);
      int[] arr = {1,2,3};

      objectOutputStream.writeObject(member);
      objectOutputStream.writeObject(product);
      objectOutputStream.writeObject(arr);
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    try(
      FileInputStream fileInputStream = new FileInputStream(path);
      ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)
    ){
      Member member = (Member) objectInputStream.readObject();
      Product product = (Product) objectInputStream.readObject();
      int[] arr = (int[]) objectInputStream.readObject();


      System.out.println(member);
      System.out.println(product);
      System.out.println(Arrays.toString(arr));
    } catch (FileNotFoundException | ClassNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }


  }
}

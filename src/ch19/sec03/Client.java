package ch19.sec03;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
  public static void main(String[] args) {
    try{
      Socket socket = new Socket("localhost", 50001);
      System.out.println("[Client] connected to server");
      socket.close();
      System.out.println("[Client] Disconnected");
    } catch (UnknownHostException e) {
      // Wrong IP
      throw new RuntimeException(e);
    } catch (IOException e) {
      // Cannot acccess to server
      throw new RuntimeException(e);
    }
  }
}

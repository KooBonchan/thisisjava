package ch19.sec03;

import netscape.javascript.JSObject;
import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
  private static ServerSocket serverSocket = null;

  public static void main(String[] args) {
    System.out.println("Print q or Q to close server");
    startServer();
    Scanner scanner = new Scanner(System.in);
    while( ! scanner.nextLine().equalsIgnoreCase("q"));
    scanner.close();
    stopServer();


  }

  public static void startServer(){
    Thread thread = new Thread(() ->{
      try{
        serverSocket = new ServerSocket(50001);
        System.out.println("Started [Server]");
        InetSocketAddress inetSocketAddress;
        while(true){
          System.out.println("Waiting for connection....");
          try(
            Socket socket = serverSocket.accept();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter)
          ){
            inetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
            System.out.println("[Server] accepted connection from Host " + inetSocketAddress.getHostName());
            bufferedWriter.write("HTTP/1.1 200 OK\r\n");
            bufferedWriter.write("Content-Type: text/html\r\n");
            bufferedWriter.write("Connection: close\r\n"); // Optional
            bufferedWriter.write("\r\n"); // End of headers
            bufferedWriter.write("<html><body>hello<body></html>");

          }
          System.out.println("[Server] Closed connection with Host " + inetSocketAddress.getHostName());

        }
      } catch (IOException e) {
        System.out.println("[Server]: " + e.getMessage());
      }
    });
    thread.start();
  }

  public static void stopServer(){
    try{
      serverSocket.close();
      System.out.println("[Server] closed");
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}

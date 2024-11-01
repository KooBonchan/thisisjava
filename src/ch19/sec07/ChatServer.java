package ch19.sec07;

import org.json.JSONObject;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChatServer {
  /*
   * Open server socket
   * Handle each client with thread -- Handled by SocketClient
   * Max client : ConnectionPoolSize
   *
   * Connection is alive from chatRoomIn to chatRoomOut
   *   --> More client, more load to connection pool?
   *   --> Max user << ThreadPoolWidth
   * Server
   * */

  ServerSocket serverSocket;
  ExecutorService threadPool = Executors.newFixedThreadPool(100);
  Map<String, SocketClient> chatRoom = Collections.synchronizedMap(new HashMap<>());

  public void start() throws IOException {
    // Listen to sockets, throw to socketclient
    serverSocket = new ServerSocket(50001);
    System.out.println("[Server] Opened server");
    Thread thread = new Thread(()->{
      try{
        while(true){
          Socket socket = serverSocket.accept(); // socket queue?
          SocketClient socketClient = new SocketClient(this, socket);
          // socket client constructor --> start thread to communicate
        }
      } catch (IOException e) {
        //???
        throw new RuntimeException(e);
      }

    });
    thread.start();
  }

  public void stop(){
    try{
      serverSocket.close();
      threadPool.shutdownNow();
      chatRoom.values().stream().forEach(SocketClient::close);
      System.out.println("[Server] Closing server");
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }

  public void addSocketClient(SocketClient socketClient){
    String key = socketClient.getKey();
    chatRoom.put(key , socketClient);
    System.out.println("New Client: " + key);
    System.out.println("Members: " + chatRoom.size());
    System.out.println();
  }

  public void removeSocketClient(SocketClient socketClient){
    String key = socketClient.getKey();
    chatRoom.remove(socketClient.getKey());
    System.out.println("Disconnected: " + key);
    System.out.println("Members: " + chatRoom.size());
    System.out.println();
  }

  public void sendToAll(SocketClient sender, String message){
    JSONObject json = new JSONObject();
    json.put("clientIp", sender.clientIp);
    json.put("chatName", sender.clientName);
    json.put("message", message);
    for(SocketClient socketClient : chatRoom.values()){
      if(socketClient.equals(sender)) continue;
      socketClient.send(json);
    }
  }

  public static void main(String[] args) {
    try{
      // Main을 기타 코드와 다른 종류의 코드로 해석해야
      // 그렇다면 각각의 메인을 외부로 분리하는 것이 맞지 않는지?
      ChatServer chatServer = new ChatServer();
      Scanner scanner = new Scanner(System.in);
      chatServer.start();
      System.out.println("""
        ----------------------------
        Enter Q or q to close server
        ----------------------------
        """);
      while(scanner.nextLine().equalsIgnoreCase("q"));
      scanner.close();
      chatServer.stop();
    }catch(IOException e){
      System.out.println("[Server] Server got error: " + e.getMessage());
    }
  }
}

package ch19.sec07;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
  Socket socket;
  DataInputStream dataInputStream;
  DataOutputStream dataOutputStream;


  String chatName;


  public void connect() throws IOException {
    socket = new Socket("localhost", 50001);
    dataInputStream = new DataInputStream(socket.getInputStream());
    dataOutputStream = new DataOutputStream(socket.getOutputStream());
    System.out.println("[Client] Connected to server");
  }

  public void send(JSONObject json) throws IOException{
    dataOutputStream.writeUTF(json.toString());
    dataOutputStream.flush();
  }

  public void receive(){
    Thread thread = new Thread(()-> {
      try {
        while (true) {
          try {
            JSONObject json = new JSONObject(dataInputStream.readUTF());
            String clientIp = json.getString("clientIp");
            String clientName = json.getString("chatName");
            String message = json.getString("message");
            System.out.printf("%s@%s: \n" + message, clientName, clientIp);
          } catch (JSONException e) {
            System.out.println(e.getMessage());
            System.out.println("[Client] Data format not matching");
          }
        }
      } catch (IOException e) {
        System.out.println("[Client] server disconnected");
        System.exit(0);
      }
    });

    thread.start();
  }

  public void close() throws IOException{
    socket.close();
    if(dataInputStream != null) dataInputStream.close();
    if(dataOutputStream != null) dataOutputStream.close();
  }


  public static void main(String[] args) {
    try{
      ChatClient chatClient = new ChatClient();
      // Extract main to Client main?
      // Why object based? for expandability
      // Single client needs 2 thread: Read / Write.
      //    Read - Connection to server
      //    Write - Connection to std in
      // Yield while no input stream?

      Scanner scanner = new Scanner(System.in);

      { // Connection prepare
        System.out.print("ID: ");
        String line;
        do{
          line = scanner.nextLine();
        }while(line.isEmpty());
        chatClient.chatName = line;
        JSONObject json = new JSONObject();
        json.put("command", "incoming");
        json.put("data", chatClient.chatName);

        chatClient.connect();
        chatClient.send(json);
        System.out.println("""
          ------------------------------
          Type message and Enter
          Enter Q or q to quit
          ------------------------------
          """);
      }

      chatClient.receive();

      while(true){
        String message = scanner.nextLine().strip();
        if(message.equalsIgnoreCase("q")) break;
        if(message.isEmpty()) continue;
        JSONObject json = new JSONObject();
        json.put("command", "message");
        json.put("data", message);
        chatClient.send(json);
      }

      scanner.close();
      chatClient.close();
    } catch (IOException e) {
      System.out.println("[Client] Cannot connect to server");
    }
  }
}


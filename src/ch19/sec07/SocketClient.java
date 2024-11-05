package ch19.sec07;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class SocketClient {
  /*
  * Server side, keep 1:1 connection with client
  *
  * */

  ChatServer chatServer;
  Socket socket;
  DataInputStream dataInputStream;
  DataOutputStream dataOutputStream;
  String clientIp;
  String clientName;

  String getKey(){
    return clientName + "@" + clientIp;
  }

  public SocketClient(ChatServer chatServer, Socket socket){
    try{
      this.chatServer = chatServer;
      this.socket = socket;

      this.dataInputStream = new DataInputStream(socket.getInputStream());
      this.dataOutputStream = new DataOutputStream(socket.getOutputStream());
      receive();
    } catch (IOException e){}
  }

  public void receive(){
    Thread thread = new Thread(()->{
      try{
        while(true){
          try{
            JSONObject json = new JSONObject(dataInputStream.readUTF());
            System.out.println(json.toString());
            String command = json.getString("command");
            switch(command.toLowerCase()){
              case "incoming":
                this.clientName = json.getString("data");
                chatServer.sendToAll(this,"Here comes a new challenger");
                chatServer.addSocketClient(this);
                break;
              case "message":
                chatServer.sendToAll(this, json.getString("data"));
                break;
              default:
                throw new JSONException("Wrong command");
            }
          }catch(JSONException e){
            System.out.println("[Server] Wrong data format, data discarded");
            System.out.println(e.getMessage());
          }
        }
      } catch(IOException e){
        System.out.println("[Server] Cliend disconnected: " + clientName);
        chatServer.removeSocketClient(this);
      }

    });
    thread.start();
  }
  public void send(JSONObject jsonObject){
    try{
      dataOutputStream.writeUTF(jsonObject.toString());
      dataOutputStream.flush();
    } catch (IOException ignored) {
    }
  }
  public void close(){
    try{
      socket.close();
    }catch(IOException ignored){}

  }
}

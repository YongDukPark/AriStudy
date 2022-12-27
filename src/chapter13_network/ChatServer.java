package chapter13_network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = null;
        Socket socket = null;
        
        DataInputStream dis = null;
        DataOutputStream dos = null;
        
        try {
            //포트를 열고 기다린다 ..
            server = new ServerSocket(6789);
            
            System.out.println("클라이언트 기다림...");
            //포트를 
            socket = server.accept();
            System.out.println("클라이언트 연결 완료");
            System.out.println("");
            
            dis = new DataInputStream(socket.getInputStream());
            dos = new DataOutputStream(socket.getOutputStream());
            
            while(true){
                System.out.println("클라이언트 메시지 : " + dis.readUTF());
                System.out.println("서버 메시지 : ");
                String messaget = Keyboard.readString();
                
                dos.writeUTF(messaget);
            }
            
        } catch (Exception e) {
            try {
                dos.close();
                dis.close();
                socket.close();
            } catch (IOException io) {
                System.out.println(io);
            }
        }
    }
}

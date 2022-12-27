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
            //��Ʈ�� ���� ��ٸ��� ..
            server = new ServerSocket(6789);
            
            System.out.println("Ŭ���̾�Ʈ ��ٸ�...");
            //��Ʈ�� 
            socket = server.accept();
            System.out.println("Ŭ���̾�Ʈ ���� �Ϸ�");
            System.out.println("");
            
            dis = new DataInputStream(socket.getInputStream());
            dos = new DataOutputStream(socket.getOutputStream());
            
            while(true){
                System.out.println("Ŭ���̾�Ʈ �޽��� : " + dis.readUTF());
                System.out.println("���� �޽��� : ");
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

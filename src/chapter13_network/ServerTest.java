package chapter13_network;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {
    public static void main(String[] args) {
        ServerSocket server = null;
        Socket socket = null;
        
        OutputStream os;
        DataOutputStream dos;
        
        String msg = "Hello Client!";
        
        try {
            //Ŭ���̾�Ʈ�� ������ ��ǥ ��Ʈ�� �����Ͽ� ���� ��ü ����
            server = new ServerSocket(7777);
            
            socket = server.accept();
            System.out.println("Ŭ���̾�Ʈ ���� ����");
            System.out.println("Server socket : " + socket.getInetAddress().getHostAddress());
            
            os = socket.getOutputStream();
            dos = new DataOutputStream(os);
            dos.writeUTF(msg);
            
            dos.close();
            socket.close();
        } catch (Exception e) {
        }
    }
}

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
            //클라이언트와 접속할 대표 포트를 지정하여 서버 객체 생성
            server = new ServerSocket(7777);
            
            socket = server.accept();
            System.out.println("클라이언트 연결 성공");
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

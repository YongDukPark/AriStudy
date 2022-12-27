package chapter13_network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ChatClient {
    public static void main(String[] args) throws Exception {
        Socket socket = null;
        DataOutputStream dos = null;
        DataInputStream dis = null;
        
        try {
            //해당 서버
            socket = new Socket("127.0.0.1", 6789);
            
            dos = new DataOutputStream(socket.getOutputStream());
            dis = new DataInputStream(socket.getInputStream());
            
            //이친구는 계속 대화시키기 위해 무한 반복문을 만들었다 컨c하면 끝나긴한다.
            while (true) {
                System.out.println("클라이언트 메시지 : ");
                String message = Keyboard.readString();
                //
                dos.writeUTF(message);
                
                System.out.println("서버 메시지 : " + dis.readUTF());
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

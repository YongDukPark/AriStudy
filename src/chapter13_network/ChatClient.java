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
            //�ش� ����
            socket = new Socket("127.0.0.1", 6789);
            
            dos = new DataOutputStream(socket.getOutputStream());
            dis = new DataInputStream(socket.getInputStream());
            
            //��ģ���� ��� ��ȭ��Ű�� ���� ���� �ݺ����� ������� ��c�ϸ� �������Ѵ�.
            while (true) {
                System.out.println("Ŭ���̾�Ʈ �޽��� : ");
                String message = Keyboard.readString();
                //
                dos.writeUTF(message);
                
                System.out.println("���� �޽��� : " + dis.readUTF());
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

package chapter13_network;

import java.net.InetAddress;
import java.util.jar.Attributes.Name;

public class InetAddressTest {
    public static void main(String[] args) {
        //host�� �����θ�� ip�ּҸ� ��ȯ�ϴ³�
        InetAddress addr = null;
        //host�� �������� �����θ�� ip�ּҸ� �迭�� ��ȯ�ϴ³�
        InetAddress[] addrArr = null;
        String name = "www.naver.com";
        
        try {
            addr = InetAddress.getByName(name);
            System.out.println("�����θ� : " +addr.getHostName());
            System.out.println("IP�ּ� : " + addr.getHostAddress());
            System.out.println("�����θ�� IP�ּ�" + addr);
            System.out.println("");
            
            addrArr = InetAddress.getAllByName(name);
            
            for(int i = 0 ; i < addrArr.length ; i++){
                System.out.println("IP���[" + i + "] : " + addrArr[i]);
            }
            
            System.out.println("");
            
            addr = InetAddress.getLocalHost();
            System.out.println("���� ȣ��Ʈ �����θ� : " + addr.getHostName());
            System.out.println("���� ȣ��Ʈ IP �ּ� : " + addr.getHostAddress());
            System.out.println("");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
    }
}

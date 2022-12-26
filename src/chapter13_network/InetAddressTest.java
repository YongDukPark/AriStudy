package chapter13_network;

import java.net.InetAddress;
import java.util.jar.Attributes.Name;

public class InetAddressTest {
    public static void main(String[] args) {
        //host의 도메인명과 ip주소를 반환하는놈
        InetAddress addr = null;
        //host의 여러개의 도메인명과 ip주소를 배열로 반환하는놈
        InetAddress[] addrArr = null;
        String name = "www.naver.com";
        
        try {
            addr = InetAddress.getByName(name);
            System.out.println("도메인명 : " +addr.getHostName());
            System.out.println("IP주소 : " + addr.getHostAddress());
            System.out.println("도메인명과 IP주소" + addr);
            System.out.println("");
            
            addrArr = InetAddress.getAllByName(name);
            
            for(int i = 0 ; i < addrArr.length ; i++){
                System.out.println("IP목록[" + i + "] : " + addrArr[i]);
            }
            
            System.out.println("");
            
            addr = InetAddress.getLocalHost();
            System.out.println("로컬 호스트 도메인명 : " + addr.getHostName());
            System.out.println("로컬 호스트 IP 주소 : " + addr.getHostAddress());
            System.out.println("");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
    }
}

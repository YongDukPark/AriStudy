/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lamda;

import java.net.Inet4Address;
import java.net.InetAddress;

public class TEST_FILE {
    public static void main(String[] args) {
        
        //ip �ּ� �������¹��
        InetAddress ipAddress;
        try {
            ipAddress = InetAddress.getLocalHost();
            
            System.out.println(ipAddress.getHostAddress());
            System.out.println(ipAddress.getHostName());
            //System.out.println(ipAddress.getRemoteAddr);
            System.out.println(Inet4Address.getLocalHost());
        } catch (Exception e) {
        }
        
    }
}

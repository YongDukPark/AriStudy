/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter02;

public class IntergralTest {
    public static void main(String[] args){
        
        //1바이트 2의 7승 마이너스 1까지 127까지 가능
        byte byteNum = 127;
        
        //2바이트 32767 까지 2의 15승-1
        short shortNum = 128;
        
        //4바이트
        int intMaxNum=2147483647;
        int intHexNum=0x10;
        
        //long 8바이트
        long longNum = 2147483648L;
        //long longNum = 214748;    long에는 끝에 L을 붙여줘야 해요 친구
        
        System.out.println(byteNum);
        
        System.out.println("intHexNum"+intHexNum);
        
        System.out.println("longNum"+longNum);
        
    }
}

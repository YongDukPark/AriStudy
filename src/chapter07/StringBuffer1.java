/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter07;

public class StringBuffer1 {
    public static void main(String[] args) {
        
        StringBuffer str = new StringBuffer();
        
        String str1 = "Hello YD";
        
        //저 buffer 객체에게 해당 텍스트를 추가한다.
        str.append(str1);
        System.out.println(str);
        
        //3번위치 Hel(여기)lo YD 에 옆에 텍스트를 추가한다.
        str.insert(3, "test");
        System.out.println(str);
        
        //1번부터 2번까지 삭제 실질적으로 한글자만 삭제하는거제
        str.delete(1, 2);
        System.out.println(str);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter09;

public class Th2 implements Runnable{

    
    public void run() {
        for(int i = 1 ; i <= 20 ; i++){
            System.out.println("run : " + i);
        }
    }
    
    public static void main(String[] args){
        
        //자기 자신 자체를 가져온다 상속되어있는 인터페이스를 사용하기 위해
        //클래스는 상속이 한마리밖에 안되나 인터페이스는 많이많이 할수있어서 ㅎ 인터페이스 상속을 주로한다.
        Th2 tm = new Th2();
        
        Thread t = new Thread(tm);
        t.start();
        
        for(int i = 100 ; i <= 120 ; i++){
            System.out.println("main : " + i);
        }
    }
    
    
}

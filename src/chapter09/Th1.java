/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter09;


//
public class Th1 extends Thread {
    public void run(){
        for(int i=1 ; i<=20 ; i++){
            System.out.println("run : " + i);
        }
    }
    public static void main(String[] args) {
        Th1 t = new Th1();
        
        t.start();
        
        for(int i = 100 ; i <= 120 ; i++){
            System.out.println("main : " + i);
        }
        
    }
}

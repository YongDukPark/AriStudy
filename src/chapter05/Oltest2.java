/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter05;

/**
 *
 * @author dydej
 */
class OverLoading2{
    void addition(int a){
        int sum = a + 100;
        System.out.println(sum);
    }
    void addition(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }
    void addition(int a, int b, int c){
        int sum = a + b + c;
        System.out.println(sum);
    }
    void addition(int a, int b, int c, int d){
        int sum = a + b + c+ d;
        System.out.println(sum);
    }
}

public class Oltest2 {
    public static void main(String[] args) {
        OverLoading2 olt2 = new OverLoading2();
        
        olt2.addition(100);
        olt2.addition(10,20);
        olt2.addition(10,20,30);
        olt2.addition(10,20,30,40);
    }
}

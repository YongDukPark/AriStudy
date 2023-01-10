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

class OverLoding1{
    void addition(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }
    
    void addtion(float a, float b){
        float sum = a+b;
        System.out.println(sum);
    }
    
    void addition(double a, double b){
        double sum = a+b;
        System.out.println(sum);
    }
    
    void addition(String a, String b){
        String sum = a+b;
        System.out.println(sum);
    }
}


public class Oltest1 {
    public static void main(String[] args) {
        OverLoding1 olt1 = new OverLoding1();
        
        String a = "0";
        String b = "0";
        int a_a = 0;
        int b_b = 0;
        
        a_a = Integer.parseInt(a)/10;
        b_b = Integer.parseInt(b)/10;
        
        System.out.println(a_a);
        System.out.println(b_b);
        
        if(a == b ){
            System.out.println("5000");
        }
        
        
        olt1.addition(8, 9);
        olt1.addition(4.1F, 5.5F);
        olt1.addition(6.29, 10.26);
        olt1.addition("ok","yes");
    }
}

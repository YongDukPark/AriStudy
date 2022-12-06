/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter02;

public class Explict_Conversion {
    public static void main(String[] args){
        double a = 3.14d;
        int b = (int) a;
        String c = String.valueOf(b);

        System.out.println("나는야 실수형"+a);
        System.out.println("나는야 정수형"+b);
        System.out.println("나는야 문자형"+c);
    }
}

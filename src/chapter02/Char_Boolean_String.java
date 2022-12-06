/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter02;

public class Char_Boolean_String {
    public static void main(String[] args){
        //char
        //이친구는 2바이트 한글자 의미
        char charVal = 'a';
        char charVal1 = '\u0041';
        char newLineVal = '\n'; 
        char tabVal = '\t';
        char quoteVal = '\"';
        System.out.println(charVal1);
        System.out.println(quoteVal);
        //boolean
        boolean bolTrue = true;
        boolean bolFalse = false;
        System.out.println(bolTrue);
        System.out.println(bolFalse);
        //String
        String test = "testtest123";
        System.out.println(test);
    }
}

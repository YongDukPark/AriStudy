/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lamda;

@FunctionalInterface
interface Calculator {
    int sum(int a, int b);
}

public class Lamda_test {
    public static void main(String[] args) {
        
        //뭐 메개변수랑 옆에 부분까지 변수명이 같으면 다른거 써도 되긴한다..
        //Calculator cal = (int a , int b) -> a+b;
        //Calculator cal = (a , b) -> a+b;    //이런식으로 타입을 안적어줘도 괜찮다.
        Calculator cal = Integer::sum;  //요런것도 가능하지롱
        int result = cal.sum(3, 6);
        System.out.println(result);
        
    }
}

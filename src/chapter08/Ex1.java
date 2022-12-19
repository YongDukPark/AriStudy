/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter08;

public class Ex1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 100;
        
        try{
            System.out.println(b/a);
        } catch (Exception e){
        /*
        } catch (ArithmeticExcetion ae){    
        } catch (나는야 오류2 ae2){
            이런식으로 많이 붙일수 있긴한데 Excetion하나로 끝을 보자
        */
            System.out.println("흐에에에에에?! 나니 나누기인데 0으로 나눈다고 흐에에에?? 하지마");
            
            //야들은 타입과 메시지다.
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            
        } finally {
            //여기는 마지막에 무조건 하는곳이다. 음 ,, 보통 close를 쓸때 주로 사용한다.
            System.out.println("끝");
        }
    }
}

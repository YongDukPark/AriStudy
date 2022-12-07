/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter04;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int score;
        
        System.out.print("점수");
        try{
            score = sc.nextInt();

            if(score >= 0 && score <= 100){
                switch(score/10){   // < 요기에 그거 들어가도됨
                    case 10 : case 9:
                        System.out.println("잘했어");
                        break;
                    case 8 :
                        System.out.println("덜잘했어");
                        break;
                    default:
                        System.out.println("부족해");
                }
            } else {
                System.out.println("이상한거 넣지마세요");
            }
            //throw new Exception(); //강제 에러 출력 
        }catch (Exception e){
            System.out.println("이상한거 넣지마요");
        }
    }
}

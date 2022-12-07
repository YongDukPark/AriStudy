/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter04;

import java.util.Scanner;

public class IfTest1 {
    public static void main(String[] args){
        Scanner UserIn = new Scanner(System.in);
        
        int score;
        
        System.out.print("점수 : ");
        //score 여기에 입력한 값이 담긴다.
        score = UserIn.nextInt();
        
        //조건 1 60이상
        //조건 2 100미만
        //조건 3 0초과
        if(score >= 60 && score > 100 && score < 0){
            System.out.println("합격");
        } else if(score > 100){
            System.out.println("100이하 숫자만 입력 가능합니다.");
        } else if(score < 0){
            System.out.println("0이상 숫자만 입력 가능합니다.");
        } else {
            System.out.println("불합격입니다.");
        }
    }
}

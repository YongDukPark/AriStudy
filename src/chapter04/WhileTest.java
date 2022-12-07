/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter04;

import java.util.Scanner;

public class WhileTest {
    public static void main(String[] args) {
        
        int total = 0;
        int count = 1;
        int bossHp = 100;
        int kick = 99999;
        int punch = 9999;
        
        Scanner sc = new Scanner(System.in);
        String answer = null;
        String answer2 = null;
        System.out.println("용사가 될준비가 되었습니까?");
        System.out.println("Y or N");
        answer = sc.next();
        answer = answer.toUpperCase();
        if(answer.equals("Y")){
            while(true){
                System.out.println("어떤 공격을 하시겠습니까");
                System.out.println("1번 발차기");
                System.out.println("2번 주먹");
                answer2 = sc.next();
                if(answer2.equals("1")){
                    bossHp -= kick;
                } else if(answer2.equals("2")) {
                    bossHp -= punch;
                } else {
                    System.out.println("보스가 도망쳤습니다.");
                    break;
                }
                if(bossHp <= 0){
                    //System.out.println(bossHp);
                    System.out.println("승리");
                    break;
                }
            }
        } else if(answer.equals("N")){
            System.out.println("집에 가시면 됩니다.");
        } else {
            System.out.println("?????");
        }
    }
}

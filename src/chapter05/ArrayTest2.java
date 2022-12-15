/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter05;

public class ArrayTest2 {
    public static void main(String[] args) {
        int[][] score = new int[][] {
            {70,80,90},
            {60,70,80},
            {50,60,70},
            {40,50,60}
        };
        
        System.out.println("------------");
        
        for(int i = 0 ; i < score.length ; i++){
            int total = 0;
            System.out.print(" " + (i+1) + " ");
            
            for(int j = 0 ; j < score[i].length ; j++){
                System.out.print(score[i][j]+" ");
                total += score[i][j];
            }
            System.out.println(total);
        }
    }
}

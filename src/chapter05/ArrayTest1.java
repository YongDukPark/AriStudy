/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter05;

public class ArrayTest1 {
    public static void main(String[] args) {
        int[] subject = {90,80,60,70,93,100,50,66};
        
        int total = 0;
        for(int i = 0 ; i < subject.length ; i++){
            total += subject[i];
        }
        System.out.println(total);
    }
}

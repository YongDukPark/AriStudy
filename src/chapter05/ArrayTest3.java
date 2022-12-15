/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter05;

public class ArrayTest3 {
    public static void main(String[] args) {
        int[] arrayA = new int[] {1,2,3,4,5};
        int[] arrayB = new int[] {10,20,30,40,50};
        
        int[] arrayC = new int[arrayA.length + arrayB.length];
        
        System.arraycopy(arrayA, 0, arrayC, 0, arrayA.length);
        System.arraycopy(arrayB, 0, arrayC, 5, arrayB.length);
        
        System.out.println("arrayA");
        for(int i = 0 ; i < arrayA.length ; i++){
            System.out.print(arrayA[i]+" ");
        }
        System.out.println("\n--------------------");
        System.out.println("arrayB");
        for(int i = 0 ; i < arrayB.length ; i++){
            System.out.print(arrayB[i]+" ");
        }
        System.out.println("\n--------------------");
        System.out.println("arrayC");
        for(int i = 0 ; i < arrayC.length ; i++){
            System.out.print(arrayC[i]+" ");
        }
    }
}

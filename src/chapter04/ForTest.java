/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter04;

public class ForTest {
    public static void main(String[] args){
        int[] HyeonaBubblePop = {4,12,8,6,3,9,7};
        int temp = 0;
        
        for(int i = 0 ; i < HyeonaBubblePop.length ; i++){
            for(int j = 1 ; j < HyeonaBubblePop.length-i ; j++){
                if(HyeonaBubblePop[j-1] > HyeonaBubblePop[j]){
                    //보관공간에 j-1값 넣기
                    temp = HyeonaBubblePop[j-1];
                    
                    //j-1 자리에 j값 넣기
                    HyeonaBubblePop[j-1] = HyeonaBubblePop[j];
                    
                    //j 에 아까 담아놓은 temp값 넣기
                    HyeonaBubblePop[j] = temp;
                }
            }
        }
        
        for(int poppoppop : HyeonaBubblePop){
            System.out.print(poppoppop+" ");
        }
    }
}

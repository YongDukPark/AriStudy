/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lamda;

import java.util.ArrayList;
import java.util.HashSet;

public class test_test {
    public static void main(String[] args) {
        int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};
        //짝수만 뽑아 중복제거 후 정렬해서 넣기
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0 ; i < data.length ; i++){
            if(data[i]%2 == 0){
                list.add(data[i]);
            }
        }
        
        HashSet<Integer> settt = new HashSet<>(list);
        
        
    }
}

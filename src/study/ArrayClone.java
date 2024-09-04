/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Administrator
 */
public class ArrayClone {
    public static void main(String[] arg){
        int[] arrayRequest1 = {5,2,4,8,1};
        int[] arrayResult1 = solution1(arrayRequest1);
        ArrayList<Integer> arrayRequest2 = new ArrayList<>(Arrays.asList(5,2,4,8,1));
        ArrayList<Integer> arrayResult2 = solution2(arrayRequest2);
        
        System.out.println("arrayRequest1 : " + Arrays.toString(arrayRequest1));    
        //출력 arrayRequest1 : [5, 2, 4, 8, 1]
        System.out.println("arrayResult1 : " + Arrays.toString(arrayResult1));      
        //출력 arrayResult1 : [1, 2, 4, 5, 8]
        System.out.println("arrayRequest2 : " + arrayRequest2.toString());          
        //출력 arrayRequest2 : [1, 2, 4, 5, 8]
        System.out.println("arrayResult2 : " + arrayResult2.toString());            
        //출력 arrayResult2 : [1, 2, 4, 5, 8]
    }
    
    private static int[] solution1(int[] arr){
        int[] result = arr.clone();
        
        Arrays.sort(result);
        
        return result;
    }
    private static ArrayList<Integer> solution2(ArrayList<Integer> arr){
        ArrayList<Integer> result = arr;
        
        Collections.sort(result);
        
        return result;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package study;

/**
 *
 * @author Administrator
 */
public class StringStringBuilder2 {
    public static void main(String[] arg){
        long beforeStringTime;
        long afterStringTime;
        long beforeStringBuilderTime;
        long afterStringBuilderTime;
        
        //코드 실행 전에 시간 받아오기
        beforeStringTime = System.currentTimeMillis(); 
        stringExecute();
        //코드 실행 후에 시간 받아오기
        afterStringTime = System.currentTimeMillis(); 
        
        //코드 실행 전에 시간 받아오기
        beforeStringBuilderTime = System.currentTimeMillis(); 
        stringBuilderExecute();
        //코드 실행 후에 시간 받아오기
        afterStringBuilderTime = System.currentTimeMillis(); 
        
        System.out.println("String 시간차이(m) = "+(afterStringTime - beforeStringTime)/1000);
        System.out.println("StringBuilder 시간차이(m) = "+(afterStringBuilderTime - beforeStringBuilderTime)/1000);
    }
    
    public static void stringExecute(){
        String testStringTemp = new String();
        for(int i = 0 ; i < 100000 ; i++){
            testStringTemp+=i;
        }
    }
    public static void stringBuilderExecute(){
        StringBuilder testStringBuilderTemp = new StringBuilder();
        for(int i = 0 ; i < 100000 ; i++){
            testStringBuilderTemp.append(i);
        }
    }
}

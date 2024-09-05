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
        
        //�ڵ� ���� ���� �ð� �޾ƿ���
        beforeStringTime = System.currentTimeMillis(); 
        stringExecute();
        //�ڵ� ���� �Ŀ� �ð� �޾ƿ���
        afterStringTime = System.currentTimeMillis(); 
        
        //�ڵ� ���� ���� �ð� �޾ƿ���
        beforeStringBuilderTime = System.currentTimeMillis(); 
        stringBuilderExecute();
        //�ڵ� ���� �Ŀ� �ð� �޾ƿ���
        afterStringBuilderTime = System.currentTimeMillis(); 
        
        System.out.println("String �ð�����(m) = "+(afterStringTime - beforeStringTime)/1000);
        System.out.println("StringBuilder �ð�����(m) = "+(afterStringBuilderTime - beforeStringBuilderTime)/1000);
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

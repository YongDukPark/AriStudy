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
public class StringStringBuilder {
    public static void main(String[] arg){
        String testStringSource = new String("TEST1");
        String testStringResult = testStringSource;
        
        StringBuilder testStringBuilderSource = new StringBuilder("TEST1");
        StringBuilder testStringBuilderResult = testStringBuilderSource;
        
        testStringResult = testStringResult+"222";
        testStringBuilderResult.append("222");
        
        System.out.println(testStringSource);
        System.out.println(testStringBuilderSource);
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter06;

class testtest{
    String testtest;
    
    public void setTest(String testtest){
        this.testtest = testtest;
    }
    
    public String getTest(){
        return testtest;
    }
}


public class settergetter {
    public static void main(String[] args) {
        testtest tt = new testtest();
        //tt.setTest("으악 오늘 쉬는날이었다니");
        tt.testtest = "으악 오늘 쉬는날이었다니";
                
        System.out.println(tt.getTest());
        
    }
}

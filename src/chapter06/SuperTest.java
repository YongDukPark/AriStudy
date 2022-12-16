/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter06;

class Parent{
    int discount = 3000;
}

class Child extends Parent{
    int discount = 3500;
    
    void output(){
        System.out.println("Parent discount = " + super.discount);
        System.out.println("Parent discount = " + discount);
    }
        
}

public class SuperTest {
    public static void main(String[] args) {
        Child c = new Child();
        c.output();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter05;

class Phone{
    String name, model, color;
    int count;
    
    Phone(String name, String model){
        this(name, model, "white", 10);
    }
    Phone(String name, String model, String color){
        this(name, model, color, 10);
    }
    Phone(String name, String model, String color, int count){
        this.name = name;
        this.model = model;
        this.color = color;
        this.count = count;
    }
    public void printOrder(){
        System.out.println(name);
        System.out.println("모델:"+model+"색:"+color+"대수:"+count);
    }
}
public class ThisTest1 {
    public static void main(String[] args) {
        Phone order1 = new Phone("홍대점", "갤럭시");
        order1.printOrder();
        Phone order2 = new Phone("신촌점", "아이폰", "black");
        order2.printOrder();
        Phone order3 = new Phone("이대점", "LG", "민트", 4);
        order3.printOrder();
    }
}

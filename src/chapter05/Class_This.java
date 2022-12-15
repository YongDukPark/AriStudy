/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter05;

class Person2{
    String name;
    int year;
    int month;
    int day;
    
    Person2(String name, int year, int month, int day){
        //this 이놈은 매개변수가 아닌 저 위에 Person2 바로 밑에 변수를 가리킬때 쓴다.
        this.name = name;
        this.year = year;
        this.month = month;
        this.day = day;
    }
}

public class Class_This {
    public static void main(String[] args) {
        Person2 pppp = new Person2("덕용박",6991,9,42);
        
        System.out.println(pppp.name);
        System.out.println(pppp.year);
        System.out.println(pppp.month);
        System.out.println(pppp.day);
    }
}

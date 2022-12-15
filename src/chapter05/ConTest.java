/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter05;

class Person{
    String name;
    int year;
    int month;
    int day;
    
    //생성자
    Person(String arg_name, int arg_year, int arg_month, int arg_day){
        //최상단 변수에 들어간다.
        this.name = arg_name;
        this.year = arg_year;
        //없어도됨
        month = arg_month;
        day = arg_day;
    }
}
/**
 *
 * @author dydej
 */
public class ConTest {
    public static void main(String[] args) {
        //순서에 맞춰서 생성자 매개변수에 들어감
        Person human = new Person("이병재", 2000, 8, 15);
        
        //위에 객체로 값을 Person 클래스의 생성자에 값을 넣고 거기서 맨위 String name; 이런식으로
        //선언해준 곳으로 들어간다.
        //그래서 밑에 human.name을 출력했을경우 위에 생성한 객체의 값이 나온다.
        System.out.println(human.name);
        System.out.println(human.year + "년" + human.month + "월" + human.day + "일생");
    }
}

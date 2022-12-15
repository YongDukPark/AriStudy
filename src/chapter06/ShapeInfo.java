/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter06;

class CommonInfo {
    double width;
    double height;
    
    void printCommon(){
        System.out.println("width : " + width);
        System.out.println("height : " + height);
    }
}

class Rectangle extends CommonInfo {
    String style;
    double calArea(){
        return width * height;
    }
    void printStyle(){
        System.out.println("사각형의 종류 : " + style);
    }
}

public class ShapeInfo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        r1.width = 5.0;
        r1.height = 5.0;
        r1.style = "정사각형";
        
        r2.width = 6.0;
        r2.height = 10.0;
        r2.style = "직사각형";
        
        System.out.println("r1 사각형 정보");
        r1.printCommon();
        r1.printStyle();
        System.out.println("면적 : " + r1.calArea());
        System.out.println("=============================");
        System.out.println("r2 사각형 정보");
        r2.printCommon();
        r2.printStyle();
        System.out.println("면적 : " + r2.calArea());
    }
}

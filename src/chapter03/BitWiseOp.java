package chapter03;

public class BitWiseOp {
    public static void main(String[] args){
        int val1 = 118;
        int val2 = 15;
        
        System.out.println("118&15 : "+(val1 & val2));
        System.out.println("118|15 : "+(val1 | val2));
        System.out.println("118^15 : "+(val1 ^ val2));
        
        //보수연산
        System.out.println("~118의 결과 값은 : "+(~val2));
        System.out.println("~15의 결과 값은 : "+(~val2));
        
    }
}

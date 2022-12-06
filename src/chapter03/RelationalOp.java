package chapter03;

public class RelationalOp {
    public static void main(String[] args){
        
        boolean result;
        int value1 = 10;
        int value2 = 20;
        
        result = value1 < value2;
        System.out.println(result); //true
        result = value1 > value2;
        System.out.println(result); //false
        result = value1 <= value2;
        System.out.println(result); //true
        result = value1 >= value2;
        System.out.println(result); //false
        result = value1 == value2;
        System.out.println(result); //false
        result = value1 != value2;
        System.out.println(result); //true
        
        String test = "박용덕";
        
        System.out.println("--------------------");
        System.out.println(test.equals("박용덕"));
        
        
    }
}

package TestPackage;

public class Main {
    
    public static void main(String[] args) {
        Single single = new Single();
    }
}

class Single{
    static{
        System.out.println("1.���� ���");
    }
    public Single(){
        System.out.println("3.������");
    }
    public static Temp temp = new Temp();
}
class Temp{
    public Temp(){
        System.out.println("2.���� ����");
    }
}


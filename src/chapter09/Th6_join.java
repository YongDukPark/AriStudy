package chapter09;

public class Th6_join {
    public static void main(String[] args) {
        Th6_1 t1 = new Th6_1();
        Th6_2 t2 = new Th6_2();
        
        System.out.println("실행시작 삐링삐리");
        
        t1.start();
        try{
            t1.join();
        } catch (InterruptedException ie){
            System.out.println(ie.toString());
        }
        
        t2.start();
        
        try {
            t2.join();
        } catch (InterruptedException ie) {
            System.out.println(ie.toString());
        }
        System.out.println("쓰레드 실행 완료");
    }
}

class Th6_1 extends Thread{
    @Override
    public void run() {
        for(int i=1 ; i<30 ; i++){
            System.out.println("t1 ");
        }
    }
}
class Th6_2 extends Thread{
    @Override
    public void run() {
        for(int i = 1 ; i < 30 ; i++){
            System.out.println("t2 ");
        }
    }
}


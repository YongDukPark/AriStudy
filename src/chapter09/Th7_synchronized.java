package chapter09;

public class Th7_synchronized {
    public static void main(String[] args) {
        Th7_1 t = new Th7_1();
        
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        
        t1.start();
        t2.start();
    }
}
class Th7_1 implements Runnable{
    
    int product = 1000;
    
    @Override
    public void run() {
        while(product > 0){
            //단순 시간지연용 for문
            for(int i = 1 ; i < 1000000000; i++);
            carry();
        }
    }
    //public void carry(){
    public synchronized void carry(){
    //여기 위에가 관건이다 method에 synchronized를 붙임으로서 이것은 carry 메소드는 한번
    //실행하게 되면 도중에 다른 쓰레드가 이 메소드를 호출할 수 없다는 의미다. carry 메소드는 2개의
    //작업을 한다. 100을 감소시키고 재고를 출력
        
        product -=100;
        System.out.println(Thread.currentThread().getName() + "재고 : " + product);
    }
}


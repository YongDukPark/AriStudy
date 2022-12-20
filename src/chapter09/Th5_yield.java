package chapter09;

public class Th5_yield {
    public static void main(String[] args) {
        Th5_1 t1 = new Th5_1();
        Th5_2 t2 = new Th5_2();

        t1.start();
        t2.start();
    }
}

class Th5_1 extends Thread{
    public void run(){
        for(int i = 1 ; i < 30 ; i++){
            System.out.print("t1 ");
            if(i == 5) Thread.yield();
            //양보하고 block 상태가 되고 쉬는게 아니라 바로 runnable 상태로 들어가 진행된다.
        }
    }
}

class Th5_2 extends Thread{
    public void run(){
        for(int i = 1 ; i < 30 ; i++){
            System.out.print("t2 ");
        }
    }
}


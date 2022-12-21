package chapter09;

public class Th6_join {
    public static void main(String[] args) {
        Th6_1 t1 = new Th6_1();
        Th6_2 t2 = new Th6_2();
        
        System.out.println("실행시작 삐링삐리");
        
        t1.start();
        try{
            //여기서 join method를 넣지 않고 실행하게 되면 중간에
            //t2 start의 join이 이 t1의 쓰레드를 block으로 만들어
            //자신이 모든 실행을 끝내기 전까지 출력을 못한다.
            t1.join();
        } catch (InterruptedException ie){
            System.out.println(ie.toString());
        }
        
        t2.start();
        try {
            //그럼 여기서 join이 눈에 띄는데
            //위에서 join이 있어 위에꺼가 다 실행되고 밑에꺼가 실행된다 만약 이후에 새로운
            //쓰레드가 있다면 그건 이부분이 끝나고 실행될거다.
            //**반드시 실행시켜야 하는 부분이 있다면 사용하면 좋을거같다.**
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


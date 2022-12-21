package chapter09;

public class Th8_synchronized_wait_notify {
    public static void main(String[] args) {
        Desk d = new Desk();
        
        Producer pro = new Producer(d);
        Consumer con = new Consumer(d);
        
        Thread t1 = new Thread(pro);
        Thread t2 = new Thread(con);
        
        //동시에 실행시키면서 쓰레드에 순서를 부여한다.
        t1.start();
        t2.start();
    }
}
//상자 만드는 역할
class Producer implements Runnable{
    
    private Desk desk;
    
    public Producer(Desk desk){
        this.desk = desk;
    }
    @Override
    public void run() {
        for(int i = 0 ; i < 10 ; i++){
            desk.putProduct();
        }
    }
}
//상자 가져가는 역할
class Consumer implements Runnable{
    
    private Desk desk;
    
    public Consumer(Desk desk){
        this.desk = desk;
    }
    @Override
    public void run() {
        for(int i = 0 ; i < 10 ; i++){
            desk.getProduct();
        }
    }
}
//책상 하는 역할
class Desk{
    
    String product = null;
    
    public synchronized void getProduct(){
        //만약 product가 null이면 상자가 없다는 의미이니 상자를 올려놓을 때까지 wait한다.
        while(product == null){
            try {
                //기다리는 부분이다.
                //대기상태에 들어간 이친구는 putProduct에서 notify 메소드를 실행해야
                //다시 실행 가능 상태가 된다.
                wait();
            } catch (Exception e) {}
        }
        System.out.println("상자 가져갔슈" + "\n");
        product = null;
        //getProduct에게 알리기 위해 notify를 실행한다.
        notify();
    }
    public synchronized void putProduct(){
        //만약 product가 상자면 아직 안가져갔다는 거니 가져갈때까지 밑에 wait로 대기한다.
        while (product == "상자") {
            try {
                //기다리는 부분이다.
                wait();
            } catch (Exception e) {}
        }
        System.out.println("상자 놓았슈");
        product = "상자";
        //getProduct에게 알린다.
        notify();
    }
}
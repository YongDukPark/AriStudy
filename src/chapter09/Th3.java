package chapter09;

public class Th3 implements Runnable{
    //자 요기서는 Thread 의 우선순위에 대해서 알아볼거다 앞서 확인해본 결과로는 쓰레드는
    //시분할 방식으로 쓰레드 간에 CPU 시간을 분배하여 실행된다. 그러나 이런 시분할 방식을 사용자가
    //임의로 조절할 수 있다. 쓰레드에 1 에서 1- 까지의 정수 값을 부여해 우선순위를 지정 가능하다.
    //만약 지정 안하면 모두 5로 동일함
    @Override
    public void run() {
        //이 for문은 단순한 시간 지연용
        for(int i=1 ; i<21 ; i++){
            System.out.print(Thread.currentThread().getName() + " ");
            for(int j = 1 ; j < 10000000 ; j++);
        }
    }
    public static void main(String[] args) {
        Th3 t = new Th3();
        
        Thread one = new Thread(t, "P01");
        //이녀석을 통해서 우선순위를 정해준다.
        one.setPriority(1);
        System.out.println("one priority = " + one.getPriority());
        
        Thread five = new Thread(t, "P02");
        //얘는 아무것도 지정해주지 않았기 때문에 우선순위가 5로 설정된다.
        System.out.println("five priority = " + five.getPriority());
        
        Thread ten = new Thread(t, "P03");
        ten.setPriority(10);
        System.out.println("ten priority = " + ten.getPriority());
        
        one.start();
        five.start();
        ten.start();
    }
}

package chapter09;

public class Th4_Sleep {
    public static void main(String[] args) {
        Th4_1 t1 = new Th4_1();
        t1.setPriority(10);
        
        Th4_2 t2 = new Th4_2();
        
        t1.start();
        t2.start();
    }
}

class Th4_1 extends Thread{

    @Override
    public void run() {
        for(int i=1; i<20 ; i++){
            System.out.println("t1 ");
            
            try{
                Thread.sleep(200);
            } catch(Exception e){
                System.out.println(e.toString());
            }}}}

class Th4_2 extends Thread{
    public void run(){
        for(int i=1 ; i <2000 ; i++){
            System.out.print("t2 ");
        }}}
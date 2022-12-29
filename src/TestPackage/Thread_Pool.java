/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread_Pool {
    public static void main(String[] args) {
        //쓰레드 풀 생성한다.
        ExecutorService service = Executors.newCachedThreadPool();
        
        //반복문을 통해 10개의 스레드가 동시에 인스턴스 생성
        for(int i = 0 ; i < 10 ; i++){
            service .submit(() -> {
               new Single2(); 
            });
        }
        
        service.shutdown();
    }
}
class Single2{
    static{
        System.out.println("static 블록 호출");
    }
    public Single2() {
        // 난수 발생시키는건 의미가없음 ,, 생각해보니 그래도 귀여우니 두자
        System.out.println("생성자 호출" + (int)(Math.random()*10));
    }
}
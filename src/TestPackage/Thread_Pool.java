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
        //������ Ǯ �����Ѵ�.
        ExecutorService service = Executors.newCachedThreadPool();
        
        //�ݺ����� ���� 10���� �����尡 ���ÿ� �ν��Ͻ� ����
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
        System.out.println("static ��� ȣ��");
    }
    public Single2() {
        // ���� �߻���Ű�°� �ǹ̰����� ,, �����غ��� �׷��� �Ϳ���� ����
        System.out.println("������ ȣ��" + (int)(Math.random()*10));
    }
}
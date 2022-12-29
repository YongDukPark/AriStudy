package TestPackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleTonTest {
    public static void main(String[] args) {
        //1.������ Ǯ ����
        ExecutorService service = Executors.newCachedThreadPool();
        
        //2.�ݺ��� ����ؼ� 10���� �����尡 ���ÿ� �ν��Ͻ� ����
        for(int i = 0 ; i < 10 ; i++){
            service.submit(()->{
                SingleTon.getInstance();
            });
        }
        //3.����
        service.shutdown();
    }
}

//�̱��� Ŭ����
class SingleTon{
    //private ������ new �ν��Ͻ� ���� ����
    public SingleTon() {
        System.out.println("�̱��� �ν��Ͻ� ����");
    }
    
    //���� �޼��带 ���� ���� Ŭ���� �ε�
    public static SingleTon getInstance(){
        return LazyHolder.INSTANCE;
    }
    
    // ���� Ŭ������ �ε��ɶ� �ʱ�ȭ ���� - �̱��� �ν��Ͻ� ����
    private static class LazyHolder {
        private static final SingleTon INSTANCE = new SingleTon();
    }
}


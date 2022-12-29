package TestPackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleTonTest_first {
    public static void main(String args[]) {
        // 1. ������ Ǯ ����
        ExecutorService service = Executors.newCachedThreadPool();

        // 2. �ݺ����� ���� - 10���� �����尡 ���ÿ� �ν��Ͻ� ����
        for (int i = 0; i < 10; i++) {
            service.submit(() -> {
                Single3.getInstance();
            });
        }
        // 3. ����
        service.shutdown();
    }
}

class Single3{
    private Single3() {
        System.out.println("�̱��� �ν��Ͻ� ����");
    }

    private static Single3 instance;

    public static Single3 getInstance() {
        // ���� �����尡 ���ÿ� if���� ����ϴ� ���
        if(instance == null) {
            // �������� �ν��Ͻ��� ������� �� ����
            instance = new Single3();
        }
        return instance;
    }
}




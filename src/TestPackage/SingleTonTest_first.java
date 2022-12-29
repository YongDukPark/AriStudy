package TestPackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleTonTest_first {
    public static void main(String args[]) {
        // 1. 스레드 풀 생성
        ExecutorService service = Executors.newCachedThreadPool();

        // 2. 반복문을 통해 - 10개의 스레드가 동시에 인스턴스 생성
        for (int i = 0; i < 10; i++) {
            service.submit(() -> {
                Single3.getInstance();
            });
        }
        // 3. 종료
        service.shutdown();
    }
}

class Single3{
    private Single3() {
        System.out.println("싱글톤 인스턴스 생성");
    }

    private static Single3 instance;

    public static Single3 getInstance() {
        // 여러 스레드가 동시에 if문을 통과하는 경우
        if(instance == null) {
            // 여러개의 인스턴스가 만들어질 수 있음
            instance = new Single3();
        }
        return instance;
    }
}




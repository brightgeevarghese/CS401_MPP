package lesson12.singleton_non_thread_safe;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {
//    static ExecutorService executor = Executors.newCachedThreadPool();
    static ExecutorService executor = Executors.newFixedThreadPool(10);
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            createAndStartThread();
            System.out.println(((ThreadPoolExecutor)executor).getActiveCount());
        }
        executor.shutdown();


    }

    private static void createAndStartThread() {
//        Thread t = new Thread(() -> Singleton.getInstance());
//        t.start();

        executor.execute(Singleton::getInstance);
//        System.out.println(Singleton.getCounter());
    }
}

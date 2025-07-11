package lesson12.thread;

public class Main2 {
    public static void main(String[] args) {
//        Thread t = new Thread(new MyThread2());
//        t.start();

        Thread t = new Thread(() -> System.out.println("Hello"));
        t.start();
    }
}
//class MyThread2 implements Runnable{
//    @Override
//    public void run() {
//        System.out.println("Hello from thread");
//    }
//}

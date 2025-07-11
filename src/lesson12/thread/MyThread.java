package lesson12.thread;

public class MyThread extends Thread{

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        //body of thread
        System.out.println("Hello from thread");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " : " + Thread.currentThread().getName());
        }
    }
}

class Main {
    public static void main(String[] args) {
        MyThread t = new MyThread("one");//new born state
        //change its status to ready to run
        t.start();
        t = new MyThread("two");//new born state
        //change its status to ready to run
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " : " + Thread.currentThread().getName());
        }
    }
}
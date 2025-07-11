package lesson12.singleton_non_thread_safe;

public class Singleton {
    private static Singleton instance;
    private static int counter = 0;

    private Singleton() {
    }
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            counter++;
            instance = new Singleton();
        }
        return instance;
    }

    public static int getCounter() {
        return counter;
    }
}

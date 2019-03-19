import java.util.Random;

public class SingletonEarlyLoad
{
    public static void main(String [] args) {
        Thread t1 = new ThreadDemo();
        Thread t2 = new ThreadDemo();
        Thread t3 = new ThreadDemo();
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class ThreadDemo extends Thread {
        @Override
        public void run() {
            System.out.println(Singleton.getInstance());
        }
    }
}

/**
 * Early Load Version
 */
class Singleton {
    private Singleton() {
        para = new Random().nextDouble();
    }

    public static Singleton ins = new Singleton();
    public double para;

    public static Singleton getInstance() {
        return ins;
    }

    @Override
    public String toString() {
        return Double.toString(para);
    }
}

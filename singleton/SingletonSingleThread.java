import java.util.Random;

public class SingletonSingleThread
{
    public static void main(String [] args) {
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
    }
}

/**
 * Single Thread Version
 */
class Singleton {
    private Singleton() {
        para = new Random().nextDouble();
    }

    public static Singleton ins;
    public double para;

    public static Singleton getInstance() {
        if (ins == null) {
            ins = new Singleton();
        }
        return ins;
    }

    @Override
    public String toString() {
        return Double.toString(para);
    }
}

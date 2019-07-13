/**
 * 饿汉式, 静态代码块
 */
import java.util.Random;

public class Singleton3 {
    public static final Singleton3 INSTANCE;

    static {
        INSTANCE = new Singleton3();
    }

    private Singleton3() {
    }
}
/**
 * 饿汉式, 枚举实现
 */
import java.util.Random;

public enum Singleton2 {
    INSTANCE;

    private int param = new Random().nextInt();
    public String toString() {
        return Integer.toString(param);
    }
}

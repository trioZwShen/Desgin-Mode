/**
 * 懒汉式, 静态内部类实现
 */

public class Singleton4 {
    private Singleton4() {
    }

    private static class Inner {
        public static Singleton4 INSTANCE = new Singleton4();
    }

    public static Singleton4 getInstance() {
        return Inner.INSTANCE;
    }
}

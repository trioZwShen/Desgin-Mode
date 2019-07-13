/**
 * 饿汉式, 直接初始化实例
 */

import java.util.Random;

public class Singleton1 {
    public static final Singleton1 INSTANCE = new Singleton1();

    private Singleton1() {
    }
}

public class SingletonTest {
    public static void main(String [] args) {
        Singleton1 s11 = Singleton1.INSTANCE;
        Singleton1 s12 = Singleton1.INSTANCE;
        System.out.println(s11);
        System.out.println(s12);
        
        Singleton2 s21 = Singleton2.INSTANCE;
        Singleton2 s22 = Singleton2.INSTANCE;
        System.out.println(s21);
        System.out.println(s22);
        
        Singleton3 s31 = Singleton3.INSTANCE;
        Singleton3 s32 = Singleton3.INSTANCE;
        System.out.println(s31);
        System.out.println(s32);

        Singleton4 s41 = Singleton4.getInstance();
        Singleton4 s42 = Singleton4.getInstance();
        System.out.println(s41==s42);
    }
}

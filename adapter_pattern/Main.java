public class Main
{
    public static void main(String [] args) {
        Duck chk = new ChickenAdapter();
        chk.quack();
        chk.fly();
    }
}

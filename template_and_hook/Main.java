public class Main
{
    public static void main(String [] args) {
        System.out.println("---- tea ----");
        Tea t = new Tea();
        t.prepareBeverage();

        System.out.println("---- coffee ----");
        Coffee c = new Coffee();
        c.prepareBeverage();
    }
}

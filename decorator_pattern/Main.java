public class Main 
{
    public static void main(String [] agrs) {
        // 原始咖啡
        Beverage b1 = new DarkRoast();
        Beverage b2 = new Decaf();

        b1 = new Milk(b1);
        b2 = new Milk(new Whip(b2));

        System.out.println(b1.getDesc() + " #: " + b1.cost());
        System.out.println(b2.getDesc() + " #: " + b2.cost());
    }
}

public class Main {
    public static void main(String [] args) {
        Duck duck1 = new WoodDuck();
        duck1.performQuack();
        duck1.performFly();
        Duck duck2 = new RedDuck();
        duck2.performQuack();
        duck2.performFly();
        duck2.setFlyBehavior(new FlyNoWay());
        duck2.performFly();
    }
}

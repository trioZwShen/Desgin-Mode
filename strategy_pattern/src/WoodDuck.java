public class WoodDuck extends Duck {
    public WoodDuck() {
        setQuackBehavior(new NoQuack());
        setFlyBehavior(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("Wood Duck.");
    }
}

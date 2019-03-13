public class RedDuck extends Duck {
    public RedDuck() {
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWings());
    }

    @Override
    public void display() {
        System.out.println("Red Duck.");
    }
}

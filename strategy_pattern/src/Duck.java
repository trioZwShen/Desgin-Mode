public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck() {}

    public void setFlyBehavior(FlyBehavior behavior) {
        flyBehavior = behavior;
    }

    public void setQuackBehavior(QuackBehavior behavior) {
        quackBehavior = behavior;
    }

    abstract public void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}

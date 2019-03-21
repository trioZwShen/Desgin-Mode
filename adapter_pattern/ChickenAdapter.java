
/**
 * 对象适配器模式, 通过组合实现
 */
public class ChickenAdapter implements Duck
{
    private Chicken chk;

    public ChickenAdapter(Chicken chk) {
        this.chk = chk;
    }

    @Override
    public void quack() {
        chk.crow();
    }

    @Override 
    public void fly() {
        chk.fly();
        chk.fly();
    }
}

/**
 * 类适配器模式, 通过继承实现
 */
public class ChickenAdapter extends Chicken implements Duck
{
    @Override
    public void quack() {
        super.crow();
    }

    @Override 
    public void fly() {
        super.fly();
        super.fly();
    }
}

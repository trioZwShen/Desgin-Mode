public class Milk extends Beverage 
{
    // 被装饰者引用
    private Beverage beverage;
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + " milk";
    }
}

public class Whip extends Beverage 
{
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }

    @Override
    public String getDesc() {
        return beverage.getDesc() + " whip";
    }
}

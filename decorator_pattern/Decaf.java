public class Decaf extends Beverage 
{
    public Decaf() {
        desc = "Decaf";
    }

    @Override
    public double cost() {
        return 1.1;
    }
}

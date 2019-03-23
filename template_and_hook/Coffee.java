public class Coffee extends BrewingBeverage
{
    @Override
    public void brew() {
        System.out.println("Brewing Coffee!");
    }

    @Override
    public void addCondiment() {
        System.out.println("add milk.");
    }

    @Override
    public boolean isFree() {
        return true;
    }
}

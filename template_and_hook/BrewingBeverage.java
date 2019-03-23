public abstract class BrewingBeverage 
{
    /**
     * common 1
     */
    final public void boilWater() {
        System.out.println("Boil Water!");
    }

    /**
     * common 2
     */
    final public void charge() {
        System.out.println("Money!");
    }

    /**
     * dynamic
     */
    public abstract void brew();

    /**
     * hook 1
     */
    public void addCondiment() {
    }

    /**
     * hook 2
     */
    public boolean isFree() {
        return false;
    }

    /**
     * template method
     */
    public void prepareBeverage() {
        boilWater();
        brew();
        addCondiment();
        if (!isFree()) {
            charge();
        }
    }
}


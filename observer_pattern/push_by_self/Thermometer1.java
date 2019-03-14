public class Thermometer1 implements Observer, DisplayElement
{
    private int temperature;
    private Subject sb;

    public Thermometer1(Subject sb) {
        this.sb = sb;
        sb.registerObserver(this);
    }

    public void update(int temperature) {
        this.temperature = temperature;
        display();
    }

    public void display() {
        System.out.println("[1]: " + temperature);
    }

    public void cancel() {
        sb.removeObserver(this);
    }
}

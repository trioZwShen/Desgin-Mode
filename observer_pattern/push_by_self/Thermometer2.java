public class Thermometer2 implements Observer, DisplayElement
{
    private int temperature;
    private Subject sb;

    public Thermometer2(Subject sb) {
        this.sb = sb;
        sb.registerObserver(this);
    }

    public void update(int temperature) {
        this.temperature = temperature;
        display();
    }

    public void display() {
        System.out.println("[2]: " + temperature);
    }

    public void cancel() {
        sb.removeObserver(this);
    }
}

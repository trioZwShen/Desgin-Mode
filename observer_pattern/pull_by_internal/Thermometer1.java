import java.util.Observer;
import java.util.Observable;

public class Thermometer1 implements Observer, DisplayElement
{
    private int temperature;
    private Observable sb;

    public Thermometer1(Observable sb) {
        this.sb = sb;
        sb.addObserver(this);
    }

    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            temperature = ((WeatherData)obs).getTemperature();
            display();
        }
    }

    public void display() {
        System.out.println("[1]: " + temperature);
    }

    public void cancel() {
        sb.deleteObserver(this);
    }
}

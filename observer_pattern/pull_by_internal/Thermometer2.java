import java.util.Observer;
import java.util.Observable;

public class Thermometer2 implements Observer, DisplayElement
{
    private int temperature;
    private Observable sb;

    public Thermometer2(Observable sb) {
        this.sb = sb;
        sb.addObserver(this);
    }

    /**
     *  采用推模式, 那么需要用到arg
     *  采用拉模式, 那么需要对应的Observable提供getter方法
     */
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            temperature = ((WeatherData)obs).getTemperature();
            display();
        }
    }

    public void display() {
        System.out.println("[2]: " + temperature);
    }

    public void cancel() {
        sb.deleteObserver(this);
    }
}

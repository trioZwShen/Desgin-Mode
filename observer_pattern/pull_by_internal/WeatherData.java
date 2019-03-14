import java.util.Observer;
import java.util.Observable;


public class WeatherData extends Observable
{
    private int temperature;

    public WeatherData() {
    }

    public void measurementsChanged() {
        notifyObservers();      // 不传参, 代表选用拉模式
        setChanged();
    }

    public void setMeasurements(int temperature) {
        this.temperature = temperature;
        measurementsChanged();
    }

    public int getTemperature() {
        return temperature;
    }
}

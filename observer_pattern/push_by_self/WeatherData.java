import java.util.Set;
import java.util.LinkedHashSet;

public class WeatherData implements Subject
{
    private int temperature;
    private Set<Observer> obList;

    public WeatherData() {
        obList = new LinkedHashSet<>();
    }

    public void registerObserver(Observer ob) {
        obList.add(ob);
    }

    public void removeObserver(Observer ob) {
        obList.remove(ob);
    }

    public void notifyObservers() {
        for (Observer ob: obList) {
            ob.update(temperature);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(int temperature) {
        this.temperature = temperature;
        measurementsChanged();
    }
}

import java.util.Set;
import java.util.LinkedHashSet;

/**
 *  使用pull模式的Subject实现, Subject可以不用处理Observer具体需要的数据
 *  提供getter方法, 并把自身引用传给Observer, 方便Observer获取它所需的数据
 */
public class WeatherData implements Subject
{
    private int temperature;
    private Set<Observer> obList;

    public WeatherData() {
        obList = new LinkedHashSet<>();
    }

    public int getTemperatue() {
        return temperature;
    }

    public void registerObserver(Observer ob) {
        obList.add(ob);
    }

    public void removeObserver(Observer ob) {
        obList.remove(ob);
    }

    public void notifyObservers() {
        for (Observer ob: obList) {
            ob.update(this);        // 使用pull模式
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

public class Main 
{
    public static void main(String [] agrs) {
        WeatherData weatherData = new WeatherData();
        weatherData.setMeasurements(100);
        Thermometer1 th1 = new Thermometer1(weatherData);
        Thermometer2 th2 = new Thermometer2(weatherData);
        weatherData.setMeasurements(200);
        th1.cancel();
        weatherData.setMeasurements(300);
    }
}

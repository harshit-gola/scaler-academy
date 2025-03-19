package Design_Patterns.Behavioral.Observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer d1 = new CurrStatDisplay();
        weatherData.registerObserver(d1);

        weatherData.setMeasurements(20, 22, 44);
    }
}

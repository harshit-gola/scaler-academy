package Design_Patterns.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private double temperature;
    private double humidity;
    private double pressure;

    List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void registerObserver(Observer observer) {
        System.out.println("Registered Observer");
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        System.out.println("Removed Observer");
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        System.out.println("Notify Observers");
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

     void measurementsChanged() {
        notifyObservers();
     }

     void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
     }
}

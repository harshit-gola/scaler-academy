package Design_Patterns.Behavioral.Observer;

public class CurrStatDisplay implements Observer, Display{
    private double temperature;
    private double humidity;
    private double pressure;

    @Override
    public void display() {
        System.out.println("Current statistic display");
        System.out.println("Temperature: " + temperature);
        System.out.println("Humidity: " + humidity);
        System.out.println("Pressure: " + pressure);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}

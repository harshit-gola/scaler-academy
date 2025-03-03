package Design_Patterns.Creational.Builder.CarProduction.Cars;

import Design_Patterns.Creational.Builder.CarProduction.Builders.CarBuilder;
import Design_Patterns.Creational.Builder.CarProduction.Components.Engine;
import Design_Patterns.Creational.Builder.CarProduction.Components.GPSNavigator;
import Design_Patterns.Creational.Builder.CarProduction.Components.Transmission;
import Design_Patterns.Creational.Builder.CarProduction.Components.TripComputer;

public class Car {
    private final CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;
    private double fuel = 0;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission,
               TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        if (this.tripComputer != null) {
            this.tripComputer.setCar(this);
        }
        this.gpsNavigator = gpsNavigator;
    }

    public static CarBuilder getCarBuilder() {
        return new CarBuilder();
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    public double getFuel() {
        return fuel;
    }
}

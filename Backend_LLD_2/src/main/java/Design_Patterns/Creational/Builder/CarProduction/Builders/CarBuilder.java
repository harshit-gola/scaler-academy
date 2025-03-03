package Design_Patterns.Creational.Builder.CarProduction.Builders;

import Design_Patterns.Creational.Builder.CarProduction.Cars.Car;
import Design_Patterns.Creational.Builder.CarProduction.Cars.CarType;
import Design_Patterns.Creational.Builder.CarProduction.Components.Engine;
import Design_Patterns.Creational.Builder.CarProduction.Components.GPSNavigator;
import Design_Patterns.Creational.Builder.CarProduction.Components.Transmission;
import Design_Patterns.Creational.Builder.CarProduction.Components.TripComputer;

public class CarBuilder implements Builder{
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public CarBuilder setCarType(CarType carType) {
        this.type = carType;
        return this;
    }

    @Override
    public CarBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public CarBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarBuilder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    @Override
    public CarBuilder setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
        return this;
    }

    @Override
    public CarBuilder setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
        return this;
    }

    public Car getResults() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}

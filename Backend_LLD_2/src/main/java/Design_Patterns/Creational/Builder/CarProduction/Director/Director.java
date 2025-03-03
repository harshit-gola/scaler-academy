package Design_Patterns.Creational.Builder.CarProduction.Director;

import Design_Patterns.Creational.Builder.CarProduction.Builders.Builder;
import Design_Patterns.Creational.Builder.CarProduction.Builders.CarBuilder;
import Design_Patterns.Creational.Builder.CarProduction.Cars.CarType;
import Design_Patterns.Creational.Builder.CarProduction.Components.Engine;
import Design_Patterns.Creational.Builder.CarProduction.Components.GPSNavigator;
import Design_Patterns.Creational.Builder.CarProduction.Components.Transmission;
import Design_Patterns.Creational.Builder.CarProduction.Components.TripComputer;

public class Director {

    public CarBuilder constructSportsCar(CarBuilder builder) {
        builder.setCarType(CarType.SEDAN);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
        return builder;
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.HASHBACK);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}

package Design_Patterns.Creational.Builder.CarProduction.Builders;

import Design_Patterns.Creational.Builder.CarProduction.Cars.CarType;
import Design_Patterns.Creational.Builder.CarProduction.Components.Engine;
import Design_Patterns.Creational.Builder.CarProduction.Components.GPSNavigator;
import Design_Patterns.Creational.Builder.CarProduction.Components.Transmission;
import Design_Patterns.Creational.Builder.CarProduction.Components.TripComputer;

public interface Builder {
    Builder setCarType(CarType carType);
    Builder setSeats(int seats);
    Builder setEngine(Engine engine);
    Builder setTransmission(Transmission transmission);
    Builder setTripComputer(TripComputer tripComputer);
    Builder setGPSNavigator(GPSNavigator gpsNavigator);
}

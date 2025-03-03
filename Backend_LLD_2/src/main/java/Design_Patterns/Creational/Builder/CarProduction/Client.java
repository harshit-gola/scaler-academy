package Design_Patterns.Creational.Builder.CarProduction;

import Design_Patterns.Creational.Builder.CarProduction.Builders.CarBuilder;
import Design_Patterns.Creational.Builder.CarProduction.Builders.CarManualBuilder;
import Design_Patterns.Creational.Builder.CarProduction.Cars.Car;
import Design_Patterns.Creational.Builder.CarProduction.Cars.CarType;
import Design_Patterns.Creational.Builder.CarProduction.Cars.Manual;
import Design_Patterns.Creational.Builder.CarProduction.Components.Engine;
import Design_Patterns.Creational.Builder.CarProduction.Components.GPSNavigator;
import Design_Patterns.Creational.Builder.CarProduction.Components.Transmission;
import Design_Patterns.Creational.Builder.CarProduction.Components.TripComputer;
import Design_Patterns.Creational.Builder.CarProduction.Director.Director;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);

        Car car = carBuilder.getResults();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

//        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResults();
        System.out.println("\nCar manual built:\n" + carManual.print());
//
//        Car suvCar = director.constructSportsCar(carBuilder).getResults();

        Car suv = Car.getCarBuilder()
                    .setCarType(CarType.SEDAN)
                    .setSeats(2)
                    .setSeats(2)
                    .setEngine(new Engine(3.0, 0))
                    .setTransmission(Transmission.SEMI_AUTOMATIC)
                    .setTripComputer(new TripComputer())
                    .setGPSNavigator(new GPSNavigator())
                    .getResults();
    }
}

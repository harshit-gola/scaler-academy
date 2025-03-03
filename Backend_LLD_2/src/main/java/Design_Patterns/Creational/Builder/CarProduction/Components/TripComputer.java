package Design_Patterns.Creational.Builder.CarProduction.Components;

import Design_Patterns.Creational.Builder.CarProduction.Cars.Car;

public class TripComputer {
    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level " + car.getFuel());
    }

    public void showStatus() {
        if (car.getEngine().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car is not started");
        }
    }
}

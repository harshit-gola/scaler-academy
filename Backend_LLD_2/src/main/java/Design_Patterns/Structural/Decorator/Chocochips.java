package Design_Patterns.Structural.Decorator;

public class Chocochips extends Addon {
    Beverage beverage;

    public Chocochips(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return 50 + beverage.getCost();
    }

    @Override
    public void getDescription() {
        beverage.getDescription();
        System.out.println("Chocochips added");
    }
}

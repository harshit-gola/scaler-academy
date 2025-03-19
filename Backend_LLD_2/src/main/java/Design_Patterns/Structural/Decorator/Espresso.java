package Design_Patterns.Structural.Decorator;

public class Espresso extends Beverage {

    @Override
    public int getCost() {
        return 90;
    }

    @Override
    public void getDescription() {
        System.out.println("Espresso coffee");
    }
}

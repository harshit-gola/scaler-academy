package Design_Patterns.Structural.Decorator;

public class Decaf extends Beverage {

    @Override
    public int getCost() {
        return 110;
    }

    @Override
    public void getDescription() {
        System.out.println("Decaf coffee");
    }
}

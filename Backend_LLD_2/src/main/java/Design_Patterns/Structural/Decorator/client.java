package Design_Patterns.Structural.Decorator;

public class client {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage = new Milk(beverage);
        beverage.getDescription();
        System.out.println("Total cost: " + beverage.getCost());

        System.out.println();

        Beverage beverage2 = new Decaf();
        beverage2 = new Milk(beverage2);
        beverage2 = new Chocochips(beverage2);
        beverage2.getDescription();
        System.out.println("Total cost: " + beverage2.getCost());

    }
}

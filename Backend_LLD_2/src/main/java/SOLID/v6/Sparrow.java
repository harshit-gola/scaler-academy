package SOLID.v6;

public class Sparrow extends Bird implements Flyable {
    FlyingBehavior lf;

    Sparrow(FlyingBehavior flyingBehavior) {
        lf = flyingBehavior;
    }

    @Override
    void eat() {
        System.out.println("Sparrow eat");
    }

    @Override
    public void fly() {
        lf.doFly();
    }

    @Override
    void makeSound() {
        System.out.println("Sparrow making sound");
    }
}

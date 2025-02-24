package SOLID.v6;

public class Eagle extends Bird implements Flyable {
    FlyingBehavior hf;

    Eagle(FlyingBehavior flyingBehavior) {
        hf = flyingBehavior;
    }

    @Override
    void eat() {

    }

    @Override
    void makeSound() {

    }

    @Override
    public void fly() {
        hf.doFly();
    }
}

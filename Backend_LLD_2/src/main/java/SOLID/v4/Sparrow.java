package SOLID.v4;

public class Sparrow extends Bird implements Flyable {
    LowFly lf;

    Sparrow() {
        lf = new LowFly();
    }

    @Override
    void eat() {
        System.out.println("Sparrow eat");
    }

    @Override
    public void fly() {
        lf.makeFly();
    }

    @Override
    void makeSound() {
        System.out.println("Sparrow making sound");
    }
}

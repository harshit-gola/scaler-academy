package SOLID.v3;

public class Sparrow extends Bird implements Flyable {
    @Override
    void eat() {
        System.out.println("Sparrow eat");
    }

    @Override
    public void fly() {

    }

    @Override
    void makeSound() {
        System.out.println("Sparrow making sound");
    }
}

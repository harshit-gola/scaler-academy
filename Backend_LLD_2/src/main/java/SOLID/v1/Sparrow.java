package SOLID.v1;

public class Sparrow extends Bird {
    @Override
    void eat() {
        System.out.println("Sparrow eat");
    }

    @Override
    void fly() {

    }

    @Override
    void makeSound() {
        System.out.println("Sparrow making sound");
    }
}

package SOLID.v1;

public class Crow extends Bird {

    @Override
    void eat() {
        System.out.println("Crow eat");
    }

    @Override
    void fly() {

    }

    @Override
    void makeSound() {
        System.out.println("Crow making sound");
    }
}

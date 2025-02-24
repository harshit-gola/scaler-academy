package SOLID.v2;

import SOLID.v2.Bird;

public class Sparrow extends FlyingBird {
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

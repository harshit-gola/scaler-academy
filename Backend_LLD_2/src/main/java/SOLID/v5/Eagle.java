package SOLID.v5;

import SOLID.v5.HighFly;

public class Eagle extends Bird implements Flyable {
    FlyingBehavior hf;

    Eagle(){
        hf = new HighFly();
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

package SOLID.v4;

public class Eagle extends Bird implements Flyable{
    HighFly hf;

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

package SOLID.v2;

// If we create separate classes for each behaviour then it will lead to class explosion (2^n),
// like  FlyWalkBird, nonflyWalkBird, flyNonWalkBird, NonFlyNonWalkBird
public abstract class Bird {
    String name;
    String color;
    int age;
    String type;

    abstract void eat();
    abstract void makeSound();
}

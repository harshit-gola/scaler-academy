package SOLID.v6;

// Dependency injection helps to inject the actual dependency
public abstract class Bird {
    String name;
    String color;
    int age;
    String type;

    abstract void eat();
    abstract void makeSound();
}

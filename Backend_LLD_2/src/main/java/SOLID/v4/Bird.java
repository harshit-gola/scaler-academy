package SOLID.v4;

// When two concrete classes are dependent on each other, like in eagle and sparrow, it leads to tight coupling
// and changes in one classes will lead to lots of changes (OCP violation).
// Using Dependency Inversion, instead of direct dependency, they should be dependent  using interface. Refer v5

public abstract class Bird {
    String name;
    String color;
    int age;
    String type;

    abstract void eat();
    abstract void makeSound();
}

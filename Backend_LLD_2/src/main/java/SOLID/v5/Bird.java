package SOLID.v5;

// Using flyingBehaviour interface, we connected two classes. Now if in future Sparrow wants to flyHigh
// then only changing the object will do the job and rest of the code remain same.

public abstract class Bird {
    String name;
    String color;
    int age;
    String type;

    abstract void eat();
    abstract void makeSound();
}

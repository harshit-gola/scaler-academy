package SOLID.v1;

public abstract class Bird {
    String name;
    String color;
    int age;
    String type;

    abstract void eat();

//  Penguin cannot fly, but we are getting the fly method from the parent class.
//  Even if we make the fly method non-abstract, still we have fly method accessible from Penguin
//  because of inheritance, which is wrong! Fly should not be there in Bird at all. Also,
//  each bird cannot have its own fly method because it will be difficult to use then.
    abstract void fly();
    abstract void makeSound();
}

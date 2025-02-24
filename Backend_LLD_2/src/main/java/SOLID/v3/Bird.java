package SOLID.v3;

// If we use inheritance, then we can still create obj with Bird reference.
// Like Bird b = new Penguin() and still call b.fly() which is wrong and lead to errors.
// Liskov's substitution principle (LSP) says object of subclass should be as it is substitutable
// in parent class ref without any change. In other words, if any one of the child is
// not going to have that behaviour then it should not be a part of parent itself and should be segregated out.
// Like Flyable fb = new Sparrow(), we will be able to substitute any flyable bird with sparrow
// and no changes required for fb.fly(). Functionality won't break!

public abstract class Bird {
    String name;
    String color;
    int age;
    String type;

    abstract void eat();
    abstract void makeSound();
}

package SOLID.v0;

public class Bird {

    String name;
    String color;
    int age;
    String type;

    void fly() {

    }

    void eat() {

    }

//    Violation of SRP (Single Responsibility Principle)
//    too many responsibilities. This method is responsible for making sound for each bird,
//    in future adding or removing bird is a headache. Also, every bird extending this class isn't
//    necessary makes sound.

//    Violation of OCP (Open Close Principle)
//    To add new bird, we have to change the function. Using inheritance we can break the code in
//    pieces and while adding new bird we can just extend the Bird class.

    void makeSound() {
        if (type.equals("Peacock")) {
            System.out.println("Peacock making sound");
        } else if (type.equals("Crow")) {
            System.out.println("Crow making sound");
        } else if (type.equals("Sparrow")) {
            System.out.println("Sparrow making sound");
        }
    }
}

package Generics;

public class Electronics extends Item {
    String author;

    public Electronics(String id, String name, double price, int quantity, String author) {
        super(id, name, price, quantity);
        this.author = author;
    }
}

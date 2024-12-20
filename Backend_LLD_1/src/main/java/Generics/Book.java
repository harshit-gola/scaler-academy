package Generics;

public class Book extends Item {
    private int warranty;

    public Book(String id, String name, double price, int quantity, int warranty) {
        super(id, name, price, quantity);
        this.warranty = warranty;
    }
}

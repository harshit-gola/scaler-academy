package Generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Item book1 = new Book("1", "Game of thrones", 99.9, 2, "James");
        Item book2 = new Book("2", "Fifty shades of grey", 79, 4, "Harry");
        Item book3 = new Book("3", "Interstellar", 129, 1, "Chris");
        Item electronic1 = new Electronics("4", "Laptop", 599, 10, 2);
        Item clothing = new Clothing("4", "T-shirt", 29, 20, "XL");

        List<Item> items = Arrays.asList(book1, book2, book3, electronic1);

        Collections.sort(items);
        for (Item item : items) {
            System.out.println(item.toString());
        }

        Inventory<Item> inventory = new Inventory<>();
        inventory.addItem(book1);
        inventory.addItem(book2);
        inventory.addItem(book3);
        inventory.addItem(electronic1);
        inventory.addItem(clothing);

        System.out.println(inventory.getItems());
    }
}

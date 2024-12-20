package Generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Item book1 = new Book("1", "Game of thrones", 99.9, 2, 5);
        Item book2 = new Book("2", "Fifty shades of grey", 79, 4, 2);
        Item book3 = new Book("3", "Interstellar", 129, 1, 3);
        List<Item> items = Arrays.asList(book1, book2, book3);

        Collections.sort(items);
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }
}

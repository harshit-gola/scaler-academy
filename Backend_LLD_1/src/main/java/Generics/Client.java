package Generics;

import java.util.*;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) {
        Item book1 = new Book("1", "Game of thrones", 1199.9, 2, "James");
        Item book2 = new Book("2", "Fifty shades of grey", 79, 4, "Harry");
        Item book3 = new Book("3", "Interstellar", 1129, 1, "Chris");
        Item electronic1 = new Electronics("4", "Laptop", 1599, 10, 2);
        Item clothing = new Clothing("4", "T-shirt", 29, 20, "XL");

        List<Item> items = Arrays.asList(book1, book2, book3, electronic1);

//        Collections.sort(items);
//        for (Item item : items) {
//            System.out.println(item.toString());
//        }

        Inventory<Item> inventory = new Inventory<>();
        inventory.addItem(book1);
        inventory.addItem(book2);
        inventory.addItem(book3);
        inventory.addItem(electronic1);
        inventory.addItem(clothing);

//        System.out.println(inventory.getItems());

        //Test orderand orderProcessor
        ProcessOrder processOrder = new ProcessOrder();
        processOrder.addOrder(new Order("O1", true));
        processOrder.addOrder(new Order("O2", false));
        processOrder.addOrder(new Order("O3", false));
        processOrder.addOrder(new Order("O4", true));
        processOrder.addOrder(new Order("O5", false));

//        while (processOrder.getTotal() > 0) {
//            System.out.println(processOrder.processOrder().getOrderID());
//        }

        items.stream().map(i -> i.getId()).forEach(System.out::println);
        items.stream().map(i -> i.getName().toLowerCase()).forEach(System.out::println);
        items.stream().map(i -> i.getName().length()).forEach(System.out::println);
        items.stream().filter(i -> i.getPrice() > 1000).forEach(Item::toString);
        System.out.println(items.stream().anyMatch(i -> i.getPrice() > 0));
        System.out.println(items.stream().allMatch(i -> i.getPrice() > 0));
        System.out.println(items.stream().noneMatch(i -> i.getQuantity() < 0));

        List<String> filteredItems = items.stream()
                                        .filter(i -> i.getPrice() > 1000 && i.getQuantity() > 0)
                                        .map(Item::getName)
                                        .distinct()
                                        .sorted()
                                        .limit(5)
                                        .toList();
        System.out.println(filteredItems);

        items.stream().reduce(0, (sum, item) -> sum + item.getQuantity(), Integer::sum);
        items.stream().reduce((i1, i2) -> {
                    return i1.getPrice() > i2.getPrice() ? i1 : i2;
                });
        Optional<String> reduce = items.stream().map(Item::getName).reduce((s1, s2) -> {
           return s1 + ", " + s2;
        });
//                reduce("", (string, item) -> string + item.getName() + ", ", (string1, string2) -> string1 + string2);
        System.out.println(reduce.orElse(null));

//        int sum = 0;
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        numbers.forEach(n -> sum+= n);

        List<String> ls = List.of("Apple", "Guava", "Mango");
        Comparator<String> cmp = (s1, s2) -> s1.compareTo(s2);
        Collections.sort(ls, cmp);
        System.out.println(ls);
    }
}

package Generics;

import java.util.*;

public class Inventory<T extends Item> {
    private HashMap<String, T> inventory = new HashMap<>();

    void addItem(T item){
        if (inventory.containsKey(item.getId())){
            System.out.println("Item already exists");
//            throw new DuplicateItemException("Item already exists");
        } else {
           inventory.put(item.getId(), item);
        }
    }

    void removeItem(int id){
        if (inventory.containsKey(id)){
            inventory.remove(id);
        } else {
            System.out.println("Item not found");
        }
    }

    T getItem(String id){
        if (inventory.containsKey(id)){
            return inventory.get(id);
        } else {
//            throw
            System.out.println("Item not found");
            return null;
        }
    }

    List<T> getItems(){
        return new ArrayList<>(inventory.values());
    }

    public List<T> filterByPrice(double minPrice, double maxPrice){
        List<T> filteredItems = new ArrayList<>();
        for (T item : inventory.values()) {
            if (item.getPrice() >= minPrice && item.getPrice() <= maxPrice){
                filteredItems.add(item);
            }
        }
        return filteredItems;
    }

    public List<T> filterByAvailability() {
        List<T> filteredItems = new ArrayList<>();
        for (T item : inventory.values()) {
            if (item.getQuantity() > 0) {
                filteredItems.add(item);
            }
        }
        return filteredItems;
    }

    public List<T> sortItems(Comparator<T> comparator){
        List<T> sortedItems = new ArrayList<>(inventory.values());
        Collections.sort(sortedItems, comparator);
        return sortedItems;
    }
}

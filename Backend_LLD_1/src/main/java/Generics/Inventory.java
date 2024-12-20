package Generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory<T extends Item> {
    private HashMap<String, T> inventory = new HashMap<>();

    void addItem(T item){
        if (inventory.containsKey(item.getId())){
            System.out.println("Item already exists");
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
            System.out.println("Item not found");
            return null;
        }
    }

    List<T> getItems(){
        return new ArrayList<>(inventory.values());
    }
}

package Generics;

import java.util.PriorityQueue;
import java.util.Queue;

public class ProcessOrder {
    Queue<Order> orders;

    ProcessOrder() {
        orders = new PriorityQueue<>();
    }

    public void addOrder(Order order) {
        orders.offer(order);
    }

    public Order processOrder() {
        return orders.poll();
    }

    public int getTotal() {
        return orders.size();
    }


}

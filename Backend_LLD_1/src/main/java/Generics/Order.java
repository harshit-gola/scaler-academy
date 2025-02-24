package Generics;

import java.util.PriorityQueue;

public class Order implements Comparable<Order> {
    private String orderID;
    private boolean isExpress;

    public Order(String orderID, boolean isExpress) {
        this.orderID = orderID;
        this.isExpress = isExpress;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }

    @Override
    public int compareTo(Order o) {
        if (this.isExpress == o.isExpress) {
            return this.orderID.compareTo(o.orderID);
        } else {
            return this.isExpress ? -1 : 1;
        }
    }
}

package concurrent2;

import java.util.List;

public class Store {
    private static final int maxSize = 5;
    int size = 0;
//
//    Store(int size) {
//        this.size = size;
//    }

    void addItem() {
        if (size > maxSize) {
            System.out.println("Maxsize reached");
        } else {
            size++;
        }
    }

    void removeItem() {
        if (size < 0) {
            System.out.println("Minsize reached");
        } else {
            size--;
        }
    }

    public int getSize() {
        return size;
    }
}

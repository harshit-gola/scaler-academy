package concurrent2;

import java.util.concurrent.Callable;

public class Consumer implements Callable<Void> {
    Store store;

    Consumer(Store store) {
        this.store = store;
    }

    @Override
    public Void call() throws Exception {
        while (true) {
            System.out.println("Consumer & store size : " + store.getSize());
            store.removeItem();
        }
    }
}

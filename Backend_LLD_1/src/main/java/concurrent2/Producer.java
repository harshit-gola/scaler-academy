package concurrent2;

import java.util.concurrent.Callable;

public class Producer implements Callable<Void> {
    Store store;

    Producer(Store store) {
        this.store = store;
    }

    @Override
    public Void call() throws Exception {
        while (true) {
            System.out.println("Producer & store size : " + store.getSize());
            store.addItem();
        }
    }

}

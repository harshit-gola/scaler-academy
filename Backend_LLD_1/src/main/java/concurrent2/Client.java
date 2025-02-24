package concurrent2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        Store store = new Store();

        Producer p1 = new Producer(store);
        Producer p2 = new Producer(store);
        Producer p3 = new Producer(store);
        Producer p4 = new Producer(store);

        Consumer c1 = new Consumer(store);
        Consumer c2 = new Consumer(store);
        Consumer c3 = new Consumer(store);
        Consumer c4 = new Consumer(store);
        Consumer c5 = new Consumer(store);
        Consumer c6 = new Consumer(store);

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(p1);
        executorService.submit(p2);
        executorService.submit(p3);
        executorService.submit(p4);
        executorService.submit(c1);
        executorService.submit(c2);
        executorService.submit(c3);
        executorService.submit(c4);
        executorService.submit(c5);
        executorService.submit(c6);

    }
}

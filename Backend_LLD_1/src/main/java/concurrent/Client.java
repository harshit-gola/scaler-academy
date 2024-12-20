package concurrent;

import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        List<Integer> arrayToSort = List.of(3, 2, 4, 1, 5, 10, 7, 2);
//
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        Sorter sorter = new Sorter(arrayToSort, executorService);
//        Future<List<Integer>> arrayToSortFuture = executorService.submit(sorter);
//
//        System.out.println(arrayToSortFuture.get());
//        executorService.shutdown();
        Value value = new Value(0);

//        Lock lock = new ReentrantLock();
        ExecutorService executorService = Executors.newCachedThreadPool();
        Adder adder = new Adder(value);
        Subtractor subtractor = new Subtractor(value);

        executorService.submit(adder);
        executorService.submit(subtractor);

        Semaphore semaphore = new Semaphore(1);
        semaphore.availablePermits();

        System.out.println(value.getValue());


    }
}

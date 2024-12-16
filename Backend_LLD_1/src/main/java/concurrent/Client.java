package concurrent;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
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

        System.out.println(value.getValue());


    }
}

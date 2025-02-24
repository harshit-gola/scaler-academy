package concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    List<Integer> arrayToSort;
    ExecutorService executorService;

    Sorter(List<Integer> arrayToSort, ExecutorService executorService) {
        this.arrayToSort = arrayToSort;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        if (arrayToSort.size() <= 1) {
            return arrayToSort;
        }

        int mid = arrayToSort.size() / 2;

        List<Integer> leftArray = arrayToSort.subList(0, mid);
        List<Integer> rightArray = arrayToSort.subList(mid, arrayToSort.size());

        Sorter leftSorter = new Sorter(leftArray, executorService);
        Sorter rightSorter = new Sorter(rightArray, executorService);

        Future<List<Integer>> leftSorterfuture = executorService.submit(leftSorter);
        Future<List<Integer>> rightSorterfuture = executorService.submit(rightSorter);

        List<Integer> leftSortedArray = leftSorterfuture.get();
        List<Integer> rightSortedArray = rightSorterfuture.get();
        return mergeSort(leftSortedArray, rightSortedArray);
    }

    private List<Integer> mergeSort(List<Integer> leftArray, List<Integer> rightArray) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> sortedList = new ArrayList<>();
        while (i < leftArray.size() && j < rightArray.size()) {
            if (leftArray.get(i) < rightArray.get(j)) {
                sortedList.add(leftArray.get(i));
                i++;
            }
            else {
                sortedList.add(rightArray.get(j));
                j++;
            }
        }
        while (i < leftArray.size()) {
            sortedList.add(leftArray.get(i++));
        }
        while (j < rightArray.size()) {
            sortedList.add(rightArray.get(j++));
        }
        return sortedList;
    }

}

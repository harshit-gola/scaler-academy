package Design_Patterns.Behavioral.Strategy;

public class SortingStrategyFactory {
    public static SortingStrategy getSortingStrategyByInputSize(int inputSize) {
        SortingStrategy sortingStrategy = null;
        if (inputSize < 10) {
            sortingStrategy = new HeapSortStrategy();
        } else {
            sortingStrategy = new MergeSortStrategy();
        }
        return sortingStrategy;
    }
}

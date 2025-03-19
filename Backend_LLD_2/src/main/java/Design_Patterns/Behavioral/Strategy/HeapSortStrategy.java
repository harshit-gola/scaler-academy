package Design_Patterns.Behavioral.Strategy;

public class HeapSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        System.out.println("HeapSort is implemented");
    }
}

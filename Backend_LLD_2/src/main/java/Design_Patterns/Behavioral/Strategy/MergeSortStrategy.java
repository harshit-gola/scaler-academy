package Design_Patterns.Behavioral.Strategy;

public class MergeSortStrategy implements SortingStrategy{
    @Override
    public void sort(int[] array) {
        System.out.println("Merge Sort is implemented");
    }
}

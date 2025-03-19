package Design_Patterns.Behavioral.Strategy;

public class DataProcessor {
    public void sortData(int[] array) {
        int inputSize = array.length;
        SortingStrategyFactory.getSortingStrategyByInputSize(inputSize).sort(array);
    }
}

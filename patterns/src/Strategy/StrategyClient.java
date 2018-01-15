package Strategy;

public class StrategyClient {
    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    private SortingStrategy sortingStrategy;

    public StrategyClient(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void executeStrategy(int[] arr) {
        sortingStrategy.sort(arr);
    }

}

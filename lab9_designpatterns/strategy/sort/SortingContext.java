package lab9_designpatterns.strategy.sort;

public class SortingContext {
    private SortingAlgorithm algorithm;

    public void setAlgorithm(SortingAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void sort(int[] data) {
        algorithm.sort(data);
    }
}

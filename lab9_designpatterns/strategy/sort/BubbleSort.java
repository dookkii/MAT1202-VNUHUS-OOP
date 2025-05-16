package lab9_designpatterns.strategy.sort;

public class BubbleSort implements SortingAlgorithm {
    @Override
    public void sort(int[] data) {
        int n = data.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n; j++) {
                if (data[i] > data[j]) {
                    int tmp = data[i];
                    data[i] = data[j];
                    data[j] = tmp;
                }
            }
        }
    }
}

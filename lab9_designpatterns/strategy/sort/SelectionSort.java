package lab9_designpatterns.strategy.sort;

public class SelectionSort implements SortingAlgorithm {
    @Override
    public void sort(int[] data) {
        int n = data.length;
        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }

            int tmp = data[i];
            data[i] = data[minIndex];
            data[minIndex] = tmp;
        }
    }
}

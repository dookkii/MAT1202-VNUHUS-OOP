package exam_2324_2nd_midterm_3.statistics;

public class ArrayDataSet extends AbstractDataSet {
    private static final int DEFAULT_CAPACITY = 8;
    private double[] data;
    private int size;

    /**
     * Hàm dựng để khởi tạo dữ liệu.
     */
    public ArrayDataSet() {
        data = new double[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public double elementAt(int index) {
        return data[index];
    }

    @Override
    public double[] elements(int from, int to) {
        double[] result = new double[to - from + 1];
        System.arraycopy(data, from, result, 0, to - from + 1);
        return result;
    }

    /**
     * Thêm phần tử dữ liệu vào đầu mảng dữ liệu.
     * Nếu mảng không còn chỗ, mở rộng mảng để có thể chứa thêm dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtStart(double value) {
        if (size == data.length) {
            allocateMore();
        }
        System.arraycopy(data, 0, data, 1, size);
        data[0] = value;
        size++;
    }

    /**
     * Thêm phần tử dữ liệu vào cuối mảng dữ liệu.
     * Nếu mảng không còn chỗ, mở rộng mảng để có thể chứa thêm dữ liệu.
     * @param value giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtEnd(double value) {
        if (size == data.length) {
            allocateMore();
        }
        data[size] = value;
        size++;
    }

    /**
     * Thêm phần tử dữ liệu vào vị trí index của mảng dữ liệu.
     * Nếu mảng không còn chỗ, mở rộng mảng để có thể chứa thêm dữ liệu.
     * @param index
     * @param value
     */
    @Override
    public void insertAtPosition(int index, double value) {
        if (size == data.length) {
            allocateMore();
        }

        if (index == size) {
            insertAtEnd(value);
        } else {
            System.arraycopy(data, index, data, index + 1, size - index);
            data[index] = value;
            size++;
        }
    }

    /**
     * Xóa phần tử dữ liệu tại vị trí index.
     * @param index
     */
    @Override
    public void remove(int index) {
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        size--;
    }

    /**
     * Xóa tất cả các phần tử dữ liệu có giá trị bằng value.
     * @param value
     */
    @Override
    public void remove(double value) {
        int newSize = 0;
        for (int i = 0; i < size; i++) {
            if (data[i] != value) {
                data[newSize++] = data[i];
            }
        }
        size = newSize;
    }

    /**
     * Mở rộng gấp đôi kích thước mảng nếu hết chỗ để chứa dữ liệu.
     */
    private void allocateMore() {
        double[] newData = new double[data.length * 2];
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
    }
}

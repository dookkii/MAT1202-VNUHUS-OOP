package midterm_2nd_term_2324_3.statistics;

import midterm_2nd_term_2324_3.studentmanager.Student;

import java.util.Arrays;

public abstract class AbstractDataSet implements DataSet {
    /**
     * Mô tả tập dữ liệu.
     * @return mô tả tập dữ liệu dạng [a1, a2, a3, ..., an].
     */
    @Override
    public String toString() {
        return Arrays.toString(dataArray());
    }

    public double[] dataArray() {
        return elements(0, size() - 1);
    }
}

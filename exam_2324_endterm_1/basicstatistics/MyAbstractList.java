package exam_2324_endterm_1.basicstatistics;

public abstract class MyAbstractList implements MyList {
    /**
     * Mô tả dữ liệu của list.
     * @return mô tả list theo định dạng [a1] [a2] [a3] ... [an]
     */
    @Override
    public String toString() {
        int n = size();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append("[").append(get(i)).append("] ");
        }

        return result.toString();
    }
}

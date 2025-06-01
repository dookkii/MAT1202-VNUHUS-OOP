package lab12.mylist;

public abstract class MyAbstractList implements MyList {
    /**
     * Mô tả dữ liệu của list.
     * @return mô tả list theo định dạng [a1] [a2] [a3] ... [an]
     */
    @Override
    public String toString() {
        int n = size();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append("[");
            sb.append(get(i));
            sb.append("] ");
        }

        return sb.toString();
    }
}

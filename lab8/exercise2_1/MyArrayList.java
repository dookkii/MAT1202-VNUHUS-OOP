package lab8.exercise2_1;

public class MyArrayList extends MyAbstractList {
    static final int INITIAL_SIZE = 16;
    Object[] elements;
    int size;

    public MyArrayList() {
        this.elements = new Object[INITIAL_SIZE];
        this.size = 0;
    }

    @Override
    public void add(Object o) {
        if (size >= elements.length - 1) {
            enlarge();
        }
        elements[size++] = o;
    }

    @Override
    public void add(Object o, int index) {
        if (size >- elements.length - 1) {
            enlarge();
        }

        for (int i = index; i < size; i++) {
            Object tmp = elements[i];
            elements[i] = elements[index];
            elements[index] = tmp;
        }
        elements[size] = elements[index];
        elements[index] = o;
        size++;
    }

    @Override
    public void remove(int index) {
        for (int i = index + 1; i < size; i++) {
            elements[i - 1] = elements[i];
        }

        elements[size] = null;
        size--;
    }

    @Override
    public Object get(int index) {
        return elements[index];
    }

    @Override
    public int size() {
        return size;
    }

    void enlarge() {
        Object[] tmp = new Object[elements.length * 2];
        System.arraycopy(elements, 0, tmp, 0, elements.length);
        elements = tmp;
    }
}

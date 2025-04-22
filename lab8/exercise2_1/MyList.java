package lab8.exercise2_1;

public interface MyList {
    void add(Object o);
    void add(Object o, int index);
    void remove(int index);

    Object get(int index);

    int size();
}

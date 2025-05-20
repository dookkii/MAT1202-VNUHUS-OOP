package lab10.iterator.cafe;

public class DinerMenuIterator implements Iterator {
    private String[] items;
    private int position = 0;

    public DinerMenuIterator(String[] items) {
        this.items = items;
    }

    public String next() {
        return items[position++];
    }

    public boolean hasNext() {
        return (!(position >= items.length || items[position] == null));
    }
}

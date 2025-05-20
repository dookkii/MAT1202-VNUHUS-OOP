package lab10.iterator.cafe;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenuIterator implements Iterator {
    private final List<String> items;
    private int position = 0;

    public PancakeHouseMenuIterator(ArrayList<String> items) {
        this.items = items;
    }

    public String next() {
        return items.get(position++);
    }

    public boolean hasNext() {
        return (position < items.size());
    }
}

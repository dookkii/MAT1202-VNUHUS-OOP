package lab10.iterator.product;

public class ProductIterator implements Iterator {
    private String[] products;
    private int position;

    public ProductIterator(String[] products) {
        this.products = products;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return (position < products.length);
    }

    @Override
    public String next() {
        if (this.hasNext()) {
            return products[position++];
        }

        return null;
    }
}

package lab10.iterator.product;

public class IteratorPatternExample {
    public static void main(String[] args) {
        String[] products = {"Laptop", "Smartphone", "Tablet", "Headphones", "Monitor"};
        ProductCatalog catalog = new ProductCatalog(products);

        Iterator iterator = catalog.getIterator();

        System.out.println("Products:");
        while (iterator.hasNext()) {
            System.out.println("+ " + iterator.next());
        }
    }
}

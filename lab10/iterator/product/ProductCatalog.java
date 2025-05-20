package lab10.iterator.product;

class ProductCatalog implements Iterable {
    private String[] productCatalog;

    public ProductCatalog(String[] products) {
        this.productCatalog = products;
    }

    @Override
    public Iterator getIterator() {
        return new ProductIterator(productCatalog);
    }
}
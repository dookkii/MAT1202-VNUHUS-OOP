package lab10.visitor.book;

public class VisitorImpl implements Visitor {
    @Override
    public void visit(BusinessBook book) {
        System.out.println("Business Book Publisher: " + book.getPublisher());
    }

    @Override
    public void visit(DesignPatternBook book) {
        System.out.println("Design Pattern Resource: " + book.getResource());
        System.out.println("Best Seller: " + book.getBestSeller());
    }

    @Override
    public void visit(JavaCoreBook book) {
        System.out.println("Java Core Resource: " + book.getResource());
        System.out.println("Favorite Book: " + book.getFavouriteBook());
    }
}

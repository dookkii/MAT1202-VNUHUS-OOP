package lab10.visitor.book;

public class VisitorPatternExample {
    public static void main(String[] args) {
        Book[] books = new Book[] {
                new BusinessBook(),
                new DesignPatternBook(),
                new JavaCoreBook()
        };

        Visitor visitor = new VisitorImpl();
        for (Book book : books) {
            book.accept(visitor);
        }
    }
}

package lab10.visitor.book;

public interface Book {
    void accept(Visitor v);
}

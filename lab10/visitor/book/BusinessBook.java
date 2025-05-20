package lab10.visitor.book;

public class BusinessBook implements Book {
    public String getPublisher() {
        return "Business Book Publisher";
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}

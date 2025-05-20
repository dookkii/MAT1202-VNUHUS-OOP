package lab10.visitor.book;

public class DesignPatternBook extends ProgrammingBook {
    @Override
    public String getResource() {
        return "Design Patterns Book";
    }

    public String getBestSeller() {
        return "Design Patterns Book Best Seller";
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}

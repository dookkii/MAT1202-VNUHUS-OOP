package lab10.visitor.book;

public class JavaCoreBook extends ProgrammingBook {
    @Override
    public String getResource() {
        return "Java Core Book";
    }

    public String getFavouriteBook() {
        return "Java Core Book Favourite";
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}

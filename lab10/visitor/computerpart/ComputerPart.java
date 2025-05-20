package lab10.visitor.computerpart;

public interface ComputerPart {
    void accept(ComputerPartVisitor visitor);
}

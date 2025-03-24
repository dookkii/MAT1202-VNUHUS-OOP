package lab5.inheritance.exercise1_4;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double size, String color, boolean filled) {
        super(size, size, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setWidth(length);
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + ",width=" + getWidth() + ",length=" + getLength() + "]";
    }
}

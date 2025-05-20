package lab10.abstractfactory.shape;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String type) {
        if (type.equals("rectangle")) {
            return new RoundedRectangle();
        } else if (type.equals("square")) {
            return new RoundedSquare();
        } else {
            throw new IllegalArgumentException();
        }
    }
}


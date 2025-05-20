package lab10.abstractfactory.shape;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String type) {
        if (type.equals("rectangle")) {
            return new Rectangle();
        } else if (type.equals("square")) {
            return new Square();
        } else {
            throw new IllegalArgumentException();
        }
    }
}

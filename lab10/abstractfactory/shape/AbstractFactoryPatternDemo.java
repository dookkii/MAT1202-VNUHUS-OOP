package lab10.abstractfactory.shape;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape shape1 = shapeFactory.getShape("rectangle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("square");
        shape2.draw();

        AbstractFactory roundedFactory = FactoryProducer.getFactory(true);
        Shape shape3 = roundedFactory.getShape("rectangle");
        shape3.draw();

        Shape shape4 = roundedFactory.getShape("square");
        shape4.draw();
    }
}

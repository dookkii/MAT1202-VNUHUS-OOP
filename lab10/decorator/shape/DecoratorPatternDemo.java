package lab10.decorator.shape;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Normal Circle:");
        circle.draw();

        System.out.println();
        System.out.println("Normal Rectangle:");
        rectangle.draw();

        System.out.println();
        System.out.println("Circle with Red Border:");
        redCircle.draw();

        System.out.println();
        System.out.println("Rectangle with Red Border:");
        redRectangle.draw();
    }
}


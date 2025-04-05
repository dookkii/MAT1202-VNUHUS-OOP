package lab6.exercise1_5;

public class TestResizableCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(69);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        ResizableCircle resizableCircle = new ResizableCircle(2);
        System.out.println(resizableCircle);
        System.out.println(resizableCircle.getArea());
        System.out.println(resizableCircle.getPerimeter());

        resizableCircle.resize(200);
        System.out.println(resizableCircle);
        System.out.println(resizableCircle.getArea());
        System.out.println(resizableCircle.getPerimeter());
    }
}

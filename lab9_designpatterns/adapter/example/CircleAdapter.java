package lab9_designpatterns.adapter.example;

public class CircleAdapter extends Shape {
    private final Circle circle;

    public CircleAdapter(Circle circle) {
        this.circle = circle;
    }

    @Override
    public double getPerimeter() {
        return 2.54 * circle.getCircumference();
    }
}

package lab9_designpatterns.adapter.example;

public class Circle {
    private double radiusInInch;

    public Circle(double radiusInInch) {
        this.radiusInInch = radiusInInch;
    }

    public double getRadiusInInch() {
        return radiusInInch;
    }

    public void setRadiusInInch(double radiusInInch) {
        this.radiusInInch = radiusInInch;
    }

    public double getCircumference() {
        return Math.PI * 2 * radiusInInch;
    }
}

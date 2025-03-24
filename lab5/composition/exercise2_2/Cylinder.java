package lab5.composition.exercise2_2;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder() {
        this.base = new Circle();
        this.height = 1.0;
    }

    public Cylinder(double radius) {
        this.base = new Circle(radius);
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) {
        this.base = new Circle(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        this.base = new Circle(radius, color);
        this.height = height;
    }

    public Circle getBase() {
        return base;
    }

    public void setBaseRadius(double radius) {
        base.setRadius(radius);
    }

    public void setBaseColor(String color) {
        base.setColor(color);
    }

    public void setBase(double radius, String color) {
        base.setRadius(radius);
        base.setColor(color);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return base.getArea() * height;
    }
}

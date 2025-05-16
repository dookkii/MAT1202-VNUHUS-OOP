package lab9_designpatterns.adapter.example;

public class Square extends Shape {
    private double sideInCentimeter;

    public Square(double sideInCentimeter) {
        this.sideInCentimeter = sideInCentimeter;
    }

    public double getSideInCentimeter() {
        return sideInCentimeter;
    }

    public void setSideInCentimeter(double sideInCentimeter) {
        this.sideInCentimeter = sideInCentimeter;
    }

    @Override
    public double getPerimeter() {
        return (double) 4 * sideInCentimeter;
    }
}

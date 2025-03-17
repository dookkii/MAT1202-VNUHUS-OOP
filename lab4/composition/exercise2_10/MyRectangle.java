package lab4.composition.exercise2_10;

import lab4.composition.exercise2_6.MyPoint;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ",bottomRight=" + bottomRight + "]";
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    public int getTopLeftX() {
        return topLeft.getX();
    }

    public void setTopLeftX(int x) {
        topLeft.setX(x);
    }

    public int getTopLeftY() {
        return topLeft.getY();
    }

    public void setTopLeftY(int y) {
        topLeft.setY(y);
    }

    public int getBottomRightX() {
        return bottomRight.getX();
    }

    public void setBottomRightX(int x) {
        bottomRight.setX(x);
    }

    public int getBottomRightY() {
        return bottomRight.getY();
    }

    public void setBottomRightY(int y) {
        bottomRight.setY(y);
    }

    public int[] getTopLeftXY() {
        return new int[] {getTopLeftX(), getTopLeftY()};
    }

    public void setTopLeftXY(int x, int y) {
        setTopLeftX(x);
        setTopLeftY(y);
    }

    public int[] getBottomRightXY() {
        return new int[] {getBottomRightX(), getBottomRightY()};
    }

    public void setBottomRightXY(int x, int y) {
        setBottomRightX(x);
        setBottomRightY(y);
    }

    public int getLength() {
        return Math.abs(getTopLeftX() - getBottomRightX());
    }

    public int getWidth() {
        return Math.abs(getTopLeftY() - getBottomRightY());
    }

    public int getArea() {
        return getLength() * getWidth();
    }

    public int getPerimeter() {
        return 2 * (getLength() + getWidth());
    }
}

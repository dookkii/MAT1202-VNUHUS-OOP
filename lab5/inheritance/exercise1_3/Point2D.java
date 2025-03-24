package lab5.inheritance.exercise1_3;

public class Point2D {
    private float x;
    private float y;

    public Point2D() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        return new float[] {getX(), getY()};
    }

    public void setXY(float x, float y) {
        setX(x);
        setY(y);
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

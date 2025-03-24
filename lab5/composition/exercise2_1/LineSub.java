package lab5.composition.exercise2_1;

public class LineSub extends Point {
    Point end;

    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    @Override
    public String toString() {
        return "Line[begin=" + super.toString() + ",end=" + end + "]";
    }

    public Point getBegin() {
        return this;
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(Point begin) {
        setX(begin.getX());
        setY(begin.getY());
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return getX();
    }

    public int getBeginY() {
        return getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int x) {
        setX(x);
    }

    public void setBeginY(int y) {
        setY(y);
    }

    public void setBeginXY(int x, int y) {
        setXY(x, y);
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    public double getLength() {
        int xDiff = this.getX() - end.getX();
        int yDiff = this.getY() - end.getY();

        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        int xDiff = this.getX() - end.getX();
        int yDiff = this.getY() - end.getY();

        return Math.atan2(yDiff, xDiff);
    }
}

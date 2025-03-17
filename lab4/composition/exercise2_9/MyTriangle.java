package lab4.composition.exercise2_9;

import lab4.composition.exercise2_6.MyPoint;

public class MyTriangle {
    final private MyPoint v1;
    final private MyPoint v2;
    final private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public String toString() {
        return "MyTriangle[v1=" + v1 + ",v2=" + v2 + ",v3=" + v3 + "]";
    }

    public double getPerimeter() {
        double d1 = v1.distance(v2);
        double d2 = v2.distance(v3);
        double d3 = v3.distance(v1);
        return d1 + d2 + d3;
    }

    public String getType() {
        double d1 = v1.distance(v2);
        double d2 = v2.distance(v3);
        double d3 = v3.distance(v1);

        if (d1 == d2 && d2 == d3) {
            return "Equilateral";
        } else if (d1 == d2 || d2 == d3 || d3 == d1) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
}

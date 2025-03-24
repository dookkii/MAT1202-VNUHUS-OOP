package lab5.inheritance.exercise1_3;

public class TestPoint {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println("Point2D: " + point2D);

        point2D.setX(3.0f);
        point2D.setY(4.0f);
        System.out.println("Point2D: " + point2D);

        float[] xy = point2D.getXY();
        System.out.println("Point2D: [" + xy[0] + ", " + xy[1] + "]");

        point2D.setXY(6.0f, 8.0f);
        System.out.println("Point2D: " + point2D);

        Point3D point3D = new Point3D();
        System.out.println("Point3D: " + point3D);

        point3D.setXYZ(1.0f, 2.0f, 3.0f);
        System.out.println("Point3D: " + point3D);

        float[] xyz = point3D.getXYZ();
        System.out.println("Point3D: [" + xyz[0] + ", " + xyz[1] + ", " + xyz[2] + "]");

        point3D.setX(7.0f);
        point3D.setY(8.0f);
        point3D.setZ(9.0f);
        System.out.println("Point3D: " + point3D);

        Point3D point3D2 = new Point3D(5.0f, 6.0f, 7.0f);
        System.out.println("Point3D2: " + point3D2);

        float[] newXYZ = point3D2.getXYZ();
        System.out.println("Point3D2 coordinates: [" + newXYZ[0] + ", " + newXYZ[1] + ", " + newXYZ[2] + "]");
    }
}

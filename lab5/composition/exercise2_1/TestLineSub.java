package lab5.composition.exercise2_1;

public class TestLineSub {
    public static void main(String[] args) {
        LineSub line = new LineSub(1, 2, 3, 4);
        System.out.println("Line: " + line);

        line.setBeginXY(5, 6);
        line.setEndXY(7, 8);
        System.out.println("New Line: " + line);

        System.out.println("Begin: " + line.getBegin());
        System.out.println("End: " + line.getEnd());

        System.out.println("BX: " + line.getBeginX());
        System.out.println("BY: " + line.getBeginY());
        System.out.println("EX: " + line.getEndX());
        System.out.println("EY: " + line.getEndY());

        line.setBeginX(9);
        line.setBeginY(10);
        line.setEndX(11);
        line.setEndY(12);
        System.out.println("Updated Line: " + line);

        System.out.println("Length: " + line.getLength());
        System.out.println("Gradian: " + line.getGradient());
    }
}

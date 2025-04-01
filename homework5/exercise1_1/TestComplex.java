package homework5.exercise1_1;

public class TestComplex {
    public static void main(String[] args) {
        MyComplex complex1 = new MyComplex(1, 3);
        System.out.println(complex1);

        complex1.setReal(6);
        complex1.setImag(9);
        System.out.println(complex1);
        System.out.println("Real part: " + complex1.getReal());
        System.out.println("Imaginary part: " + complex1.getImag());

        complex1.setValue(4, 20);
        System.out.println(complex1);

        MyComplex complex2 = new MyComplex(1, 0);
        System.out.println(complex2.isReal());
        complex2.setValue(0, 1);
        System.out.println(complex2.isImaginary());

        complex2.setValue(1, 1);
        System.out.println(complex1.equals(complex2));
        System.out.println(complex2.magnitude());

        complex2.addInto(complex1);
        System.out.println(complex2);
        System.out.println(complex2.addNew(complex1));
    }
}

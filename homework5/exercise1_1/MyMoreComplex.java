package homework5.exercise1_1;

public class MyMoreComplex {
    private double real;
    private double imag;

    public MyMoreComplex() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public MyMoreComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.setReal(real);
        this.setImag(imag);
    }

    public String toString() {
        return "(" + real + " + " + imag + "i)";
    }

    public boolean isReal() {
        return imag == 0;
    }

    public boolean isImaginary() {
        return real == 0;
    }

    public boolean equals(double real, double imag) {
        return (this.real == real) && (this.imag == imag);
    }

    public boolean equals(MyMoreComplex another) {
        return equals(another.real, another.imag);
    }

    public double magnitude() {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imag, 2));
    }

    public double argument() {
        return Math.atan(imag / real);
    }

    public MyMoreComplex add(MyMoreComplex right) {
        real += right.real;
        imag += right.imag;

        return this;
    }

    public MyMoreComplex addNew(MyMoreComplex right) {
        MyMoreComplex newComplex = new MyMoreComplex();
        newComplex.real = this.real + right.real;
        newComplex.imag = this.imag + right.imag;

        return newComplex;
    }

    public MyMoreComplex subtract(MyMoreComplex right) {
        real -= right.real;
        imag -= right.imag;

        return this;
    }

    public MyMoreComplex subtractNew(MyMoreComplex right) {
        MyMoreComplex newComplex = new MyMoreComplex();
        newComplex.real = this.real - right.real;
        newComplex.imag = this.imag - right.imag;

        return newComplex;
    }

    public MyMoreComplex multiply(MyMoreComplex right) {
        real = (real * right.real - imag * right.imag);
        imag = (real * right.imag + imag * right.real);

        return this;
    }

    public MyMoreComplex divide(MyMoreComplex right) {
        real = (real * right.real + imag * right.imag) / (Math.pow(right.real, 2) + Math.pow(right.imag, 2));
        real = (imag * right.real - real * right.imag) / (Math.pow(right.real, 2) + Math.pow(right.imag, 2));

        return this;
    }

    public MyMoreComplex conjugate() {
        return new MyMoreComplex(real, -imag);
    }
}

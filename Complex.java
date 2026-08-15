package Week3assignment;

public class Complex {

    private int real;
    private int imaginary;

    // Parameterized constructor
    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Copy constructor
    public Complex(Complex c) {
        this.real = c.real;
        this.imaginary = c.imaginary;
    }

    // Addition
    public Complex add(Complex c) {

        int newReal = this.real + c.real;
        int newImaginary = this.imaginary + c.imaginary;

        return new Complex(newReal, newImaginary);
    }

    // Subtraction
    public Complex subtract(Complex c) {

        int newReal = this.real - c.real;
        int newImaginary = this.imaginary - c.imaginary;

        return new Complex(newReal, newImaginary);
    }

    public String toString() {

        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        }

        return real + " - " + Math.abs(imaginary) + "i";
    }
}
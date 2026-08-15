package Week3assignment;

public class Rational {

    private int numerator;
    private int denominator;

    // Parameterized constructor
    public Rational(int numerator, int denominator) {

        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Copy constructor
    public Rational(Rational r) {
        this.numerator = r.numerator;
        this.denominator = r.denominator;
    }

    // Addition
    public Rational add(Rational r) {

        int newNumerator =
                (this.numerator * r.denominator)
                +
                (r.numerator * this.denominator);

        int newDenominator =
                this.denominator * r.denominator;

        return new Rational(newNumerator, newDenominator);
    }

    // Subtraction
    public Rational subtract(Rational r) {

        int newNumerator =
                (this.numerator * r.denominator)
                -
                (r.numerator * this.denominator);

        int newDenominator =
                this.denominator * r.denominator;

        return new Rational(newNumerator, newDenominator);
    }

    public String toString() {
        return numerator + "/" + denominator;
    }
}

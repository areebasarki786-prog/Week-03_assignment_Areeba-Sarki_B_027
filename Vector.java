package Week3assignment;

public class Vector {

    int a;
    int b;
    int c;

    // Parameterized constructor
    public Vector(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Copy constructor
    public Vector(Vector v) {
        this.a = v.a;
        this.b = v.b;
        this.c = v.c;
    }

    // Dot Product
    public int dotProduct(Vector v) {
        return (this.a * v.a) +
               (this.b * v.b) +
               (this.c * v.c);
    }

    // Cross Product
    public Vector crossProduct(Vector v) {

        int i = (this.b * v.c) - (this.c * v.b);

        int j = (this.c * v.a) - (this.a * v.c);

        int k = (this.a * v.b) - (this.b * v.a);

        return new Vector(i, j, k);
    }

    // Magnitude
    public double magnitude() {
        return Math.sqrt(a * a + b * b + c * c);
    }

    // Projection
    public double projection(Vector v) {
        return dotProduct(v) / v.magnitude();
    }

    public String toString() {
        return a + "i + " + b + "j + " + c + "k";
    }
}

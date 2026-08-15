package Week3assignment;

public class Triangle {

    private Line l1;
    private Line l2;
    private Line l3;

    // Triangle created using three Lines
    public Triangle(Line l1, Line l2, Line l3) {
        this.l1 = new Line(l1);
        this.l2 = new Line(l2);
        this.l3 = new Line(l3);
    }

    // Copy constructor
    public Triangle(Triangle t) {
        this.l1 = new Line(t.l1);
        this.l2 = new Line(t.l2);
        this.l3 = new Line(t.l3);
    }

    // Perimeter
    public double perimeter() {
        return l1.length() + l2.length() + l3.length();
    }

    // Area using Heron's Formula
    public double area() {

        double a = l1.length();
        double b = l2.length();
        double c = l3.length();

        double s = (a + b + c) / 2;

        return Math.sqrt(
            s * (s - a) * (s - b) * (s - c)
        );
    }

    public String toString() {
        return "Triangle:\n" +
               l1 + "\n" +
               l2 + "\n" +
               l3;
    }
}
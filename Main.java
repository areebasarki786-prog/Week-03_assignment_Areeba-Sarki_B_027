package Week3assignment;

public class Main {

    public static void main(String[] args) {

        // =====================================
        // POINT
        // =====================================

        System.out.println("===== POINT =====");

        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(0, 3);

        System.out.println("P1 = " + p1);
        System.out.println("P2 = " + p2);
        System.out.println("P3 = " + p3);

        Point addition = p1.add(p2);
        System.out.println("P1 + P2 = " + addition);

        Point subtraction = p2.subtract(p3);
        System.out.println("P2 - P3 = " + subtraction);

        Point copyPoint = new Point(p1);
        System.out.println("Copy of P1 = " + copyPoint);


        // =====================================
        // VECTOR
        // =====================================

        System.out.println("\n===== VECTOR =====");

        Vector v = new Vector(2, 3, 1);
        Vector u = new Vector(1, 2, 2);

        System.out.println("v = " + v);
        System.out.println("u = " + u);

        System.out.println("Dot Product = "
                + v.dotProduct(u));

        Vector cross = v.crossProduct(u);
        System.out.println("Cross Product = " + cross);

        System.out.println("Magnitude of v = "
                + v.magnitude());

        System.out.println("Projection of v on u = "
                + v.projection(u));

        Vector vCopy = new Vector(v);

        System.out.println("vCopy = " + vCopy);

        vCopy.a = 99;

        System.out.println("vCopy after change = "
                + vCopy);

        System.out.println("Original v = " + v);


        // =====================================
        // LINE
        // =====================================

        System.out.println("\n===== LINE =====");

        Line l1 = new Line(p1, p2);
        Line l2 = new Line(p2, p3);
        Line l3 = new Line(p3, p1);

        System.out.println("L1 = " + l1);
        System.out.println("L2 = " + l2);
        System.out.println("L3 = " + l3);

        System.out.println("Length of L1 = "
                + l1.length());


        // =====================================
        // TRIANGLE
        // =====================================

        System.out.println("\n===== TRIANGLE =====");

        Triangle triangle =
                new Triangle(l1, l2, l3);

        System.out.println(triangle);

        System.out.println("Perimeter = "
                + triangle.perimeter());

        System.out.println("Area = "
                + triangle.area());

        Triangle triangleCopy =
                new Triangle(triangle);

        System.out.println("Triangle Copy:");
        System.out.println(triangleCopy);


        // =====================================
        // COMPLEX
        // =====================================

        System.out.println("\n===== COMPLEX =====");

        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(2, 5);

        System.out.println("C1 = " + c1);
        System.out.println("C2 = " + c2);

        System.out.println("C1 + C2 = "
                + c1.add(c2));

        System.out.println("C1 - C2 = "
                + c1.subtract(c2));

        Complex copyComplex = new Complex(c1);
        System.out.println("Copy of C1 = "
                + copyComplex);


        // =====================================
        // RATIONAL
        // =====================================

        System.out.println("\n===== RATIONAL =====");

        Rational r1 = new Rational(2, 3);
        Rational r2 = new Rational(1, 6);

        System.out.println("R1 = " + r1);
        System.out.println("R2 = " + r2);

        System.out.println("R1 + R2 = "
                + r1.add(r2));

        System.out.println("R1 - R2 = "
                + r1.subtract(r2));

        Rational copyRational = new Rational(r1);
        System.out.println("Copy of R1 = "
                + copyRational);
    }
}

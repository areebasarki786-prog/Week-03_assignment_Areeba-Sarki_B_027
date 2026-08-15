package Week3assignment;

public class Line {

    private Point p1;
    private Point p2;

    // Parameterized constructor
    public Line(Point p1, Point p2) {
        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
    }

    // Copy constructor
    public Line(Line l) {
        this.p1 = new Point(l.p1);
        this.p2 = new Point(l.p2);
    }

    // Calculate length of line
    public double length() {

        int xDifference = p2.getX() - p1.getX();
        int yDifference = p2.getY() - p1.getY();

        return Math.sqrt(
            xDifference * xDifference +
            yDifference * yDifference
        );
    }

    public Point getP1() {
        return new Point(p1);
    }

    public Point getP2() {
        return new Point(p2);
    }

    public String toString() {
        return "Line from " + p1 + " to " + p2;
    }
}

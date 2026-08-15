package Week3assignment;

public class Point {
    private int x;
    private int y;

    // Default constructor
    public Point() {
        x = 0;
        y = 0;
    }

    // Parameterized constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    // Addition of two points
    public Point add(Point p) {
        return new Point(this.x + p.x, this.y + p.y);
    }

    // Subtraction of two points
    public Point subtract(Point p) {
        return new Point(this.x - p.x, this.y - p.y);
    }

    // Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

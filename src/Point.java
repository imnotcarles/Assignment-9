public class Point {

    private double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point difference(Point point) {
        return new Point(this.x - point.getX(), this.y - point.getY());
    }

    public void displayCoordinate() {
        System.out.println("The x-coordinate is: " + x);
        System.out.println("The y-coordinate is: " + y);
    }

    public double distance(Point point) {
        double distanceX = this.x - point.getX();
        double distanceY = this.y - point.getY();
        return Math.sqrt(distanceX * distanceX + distanceY * distanceY);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void linearEquation(Point point) throws Exception {
        double m = slope(point);
        double b = yIntercept(point);
        System.out.println("y = " + m + "x + " + b);
    }

    public Point midpoint(Point point) {
        return new Point((this.x + point.getX()) / 2, (this.y + point.getY()) / 2);
    }

    public double slope(Point point) throws Exception {
        if (this.x == point.getX()) {
            throw new Exception("Undefined slope.");
        }
        return (this.y - point.getY()) / (this.x - point.getX());
    }

    public Point sum(Point point) {
        return new Point(this.x + point.getX(), this.y + point.getY());
    }

    public double yIntercept(Point point) throws Exception {
        double m = slope(point);
        return this.y - m * this.x;
    }
}
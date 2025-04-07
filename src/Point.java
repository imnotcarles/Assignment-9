public class Point {
   
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point difference(Point point) {
        Point p1 = new Point(x,y);
        Point p2 = new Point(x,y);
        Point p3 = p1.difference(p2);
        return p3;
    }

    public void displayCoordinate() {
        
    }

    public double distance(Point point) {

    }

    public double getX() {

    }

    public double getY() {

    }

    public void linearEquation(Point point) {

    }

    public Point midpoint(Point point) {

    }

    public double slope(Point point) {

    }

    public Point sum(Point point) {

    }

    public double yIntercept(Point point) {

    }
}

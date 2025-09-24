public class Circle2 extends Point {
    private double radius;
    public Circle2() {
        super();
        this.radius = 0.0;
    }
    public Circle2(Point center, double r) {
        super(center.getX(), center.getY());
        this.radius = r;
    }
    public Circle2(int x, int y, double r) {
        super(x, y);
        this.radius = r;
    }
    public Circle2(Circle2 c) {
        super(c.getX(), c.getY());
        this.radius = c.radius;
    }
    public Point getCenter() {
        return new Point(getX(), getY());
    }
    public void setCenter(Point pt) {
        setX(pt.getX());
        setY(pt.getY());
    }
    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radiusValue) {
        this.radius = radiusValue;
    }
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
    public String toString() {
        return "圓: 圓心 (" + getX() + ", " + getY() + "), 半徑 " + String.format("%.2f", radius);
    }
}

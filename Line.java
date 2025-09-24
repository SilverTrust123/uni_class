public class Line {
    private Point point1;
    private Point point2;
    public Line() {
        this.point1 = new Point(); 
        this.point2 = new Point(); 
    }
    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }
    public Line(Line line1) {
        this.point1 = new Point(line1.getPoint1().getX(), line1.getPoint1().getY());
        this.point2 = new Point(line1.getPoint2().getX(), line1.getPoint2().getY());
    }
    public void setPoint1(Point point) {
        this.point1 = point;
    }
    public Point getPoint1() {
        return this.point1;
    }
    public void setPoint2(Point point) {
        this.point2 = point;
    }
    public Point getPoint2() {
        return this.point2;
    }
    public double getLength() {
        int dx = point2.getX() - point1.getX();
        int dy = point2.getY() - point1.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
    public String toString() {
        return String.format("直線: 端點1(%d, %d), 端點2(%d, %d);  長度: %.2f",point1.getX(), point1.getY(),point2.getX(), point2.getY(),getLength());
    }
}

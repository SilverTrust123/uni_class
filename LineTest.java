public class LineTest {
    public static void main(String[] args) {
        Point p1 = new Point(); 
        Point p2 = new Point(5, 5);
        Line line1 = new Line(p1, p2);
        System.out.println(line1.toString()); 
        Line line2 = new Line(line1); 
        System.out.println(line2.toString()); 
    }
}

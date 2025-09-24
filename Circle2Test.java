public class Circle2Test {
    public static void main(String[] args) {
        Point p1 = new Point(5, 5);
        Circle2 c1 = new Circle2(p1, 1.0);
        Circle2 c2 = new Circle2(c1);

        System.out.println(c2.toString());
        System.out.printf("面積： %.4f%n", c2.getArea());
    }
}

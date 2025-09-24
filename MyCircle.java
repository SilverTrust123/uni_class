package B11221009;

public class MyCircle {
    public static double PI = 3.141592635359;
    private double radius;
    public MyCircle(double radius){
        this.radius = radius;
    }
    public void setradius(double radius){
        this.radius = radius;
    }
    public double getradius(){
        return radius;
    }
    public double circleArea(){
        double Area = radius*radius*PI;
        return Area;
    }
}

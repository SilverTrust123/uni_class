package B11221009;

public class Rectangle {
	private int width;
	private int heigh;
	
	public Rectangle(int width,int heigh) {
		this.width = width;
		this.heigh = heigh;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth(){
		return width;
	}
	
	public void setHeigh(int heigh){
		this.heigh = heigh;
	}
	public int getHeigh(){
		return heigh;
	}
	
	public boolean isSqure() {
		if(heigh == width) {
			return true;
		}else {
			return false;
		}
	}
	
	public int getArea() {
		int area = heigh*width;
		return area;
	}
	
	public int getPerimeter() {
		int perimeter = 2 * (heigh + width);
		return perimeter;
	}
}

package exercise1entities;

public class entities1 {
	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	public double perimeter() {
		return ((width * 2) + (height * 2));
	}
	public double diagonal() {
		return Math.sqrt((width * width) + (height * height));
	}
	public String toString() {
		return "AREA = " + String.format("%.2f", area())
			+ "\nPERIMETER = " + String.format("%.2f", perimeter())
			+ "\nDIAGONAL = " + String.format("%.2f", diagonal());
	}
}

/* CSE 114
 * Christopher Wong (#111386693)
 * Lab Section 05
 */
import java.text.DecimalFormat;
public class RectangleObject {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###.0#");
		Rectangle r1 = new Rectangle(4,40);
		Rectangle r2 = new Rectangle(3.5,35.9);
		System.out.println("Rectangle 1: " + df.format(r1.getWidth()) + " " + df.format(r1.getHeight()) + " " + df.format(r1.getArea()) +" "+ df.format(r1.getPerimeter()));
		System.out.print("Rectangle 2: " + df.format(r2.getWidth()) + " " + df.format(r2.getHeight()) + " " + df.format(r2.getArea()) +" "+ df.format(r2.getPerimeter()));
	}
}

class Rectangle {
	private double width;
	private double height;
	public Rectangle() {
		width = 1;
		height = 1;
	}
	public Rectangle(double w, double h) {
		width = w;
		height = h;
	}
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	public double getArea() {
		double area = width * height;
		return area;
	}
	public double getPerimeter() {
		double perimeter = 2*width + 2*height;
		return perimeter;
	}
}
	

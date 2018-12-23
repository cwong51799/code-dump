/* Christopher Wong (#111386693)
 * CSE 114
 * Lab Section 05
 */
import java.util.Scanner;
public class GeometricObject {
  private String color = "white";
  private boolean filled;
  private java.util.Date dateCreated;
  public GeometricObject() {
    dateCreated = new java.util.Date();
  }
  public GeometricObject(String color, boolean filled) {
    dateCreated = new java.util.Date();
    this.color = color;
    this.filled = filled;
  }
  public String getColor() {   return color;  }
  public void setColor(String color) {  this.color = color;  }
  public boolean isFilled() {   return filled;  }
  public void setFilled(boolean filled) {  this.filled = filled;  }
  public java.util.Date getDateCreated() {   return dateCreated;  }
  public String toString() {
    return "created on " + dateCreated + "\ncolor: " + color +
      " and filled: " + filled;
  }
  public static void main(String[] args) {
	  GeometricObject go = new GeometricObject();
	  System.out.println(go);
  }
}
class Triangle extends GeometricObject{
	private double side1,side2,side3 = 1;
	public Triangle() {
	}
	public Triangle (double newS1, double newS2, double newS3) {
		side1 = newS1;
		side2 = newS2;
		side3 = newS3;
	}
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	public double getArea() {
	double s = (side1+side2+side3)/2;
	return (Math.pow(s*(s-side1)*(s-side2)*(s-side3), 0.5));
	}
	public double getPerimeter() {
		return(side1+side2+side3);
	}
	public String toString() {
		return ("Triangle: side1="+side1+" side2="+side2+" side3="+side3);
	}
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the three sides of the triangle: ");
		double s1 = input.nextDouble();
		double s2 = input.nextDouble();
		double s3 = input.nextDouble();
		System.out.println("Enter the color of the triangle: ");
		String color = input.next();
		System.out.println("Indicate whether the triangle is filled or not (true/false): ");
		boolean filled = input.nextBoolean();
		input.close();
		GeometricObject g1 = new GeometricObject(color, filled);
		Triangle t1 = new Triangle(s1,s2,s3);
		System.out.println("Area:"+t1.getArea()+" Perimeter:"+t1.getPerimeter()+" Color:"+g1.getColor()+" Filled:"+g1.isFilled());
	}
}

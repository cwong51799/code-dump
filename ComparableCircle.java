/* Christopher Wong (#111386693)
 * CSE 114
 * Lab Section 05
 */
class Circle extends GeometricObject {
	  double radius;
	  public Circle() {   }
	  public Circle(double radius) {
	    this.radius = radius;  
	  }
	  public double getRadius() {
	    return radius;
	  }
	  public void setRadius(double radius) {
	    this.radius = radius;  
	  }
	  public double getArea() {
	    return radius * radius * Math.PI;
	  }
	  public double getDiameter() {
	    return 2 * radius;
	  }
	  public double getPerimeter() {
	    return 2 * radius * Math.PI;
	  }
	  /* Print the circle info */
	  public void printCircle() {
	    System.out.println("The circle is created " + getDateCreated() +
	      " and the radius is " + radius);
	  }
}
public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{
	ComparableCircle(double r){
		radius = r;
	}
	public int compareTo(ComparableCircle c) {
		if (getArea() > c.getArea()) {
			return 1;
		}
		if (getArea() < c.getArea()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	public static void main(String[] args) {
		ComparableCircle myCircle = new ComparableCircle(5);
		ComparableCircle myCircle2 = new ComparableCircle(3);
		if (myCircle.compareTo(myCircle2) == 1)
			System.out.println("Circle 1 has a greater area.");
		if (myCircle.compareTo(myCircle2) == -1)
			System.out.println("Circle 2 has a greater area.");
		if (myCircle.compareTo(myCircle2) == 0)
			System.out.println("The two circles are equal in area.");
	}
}

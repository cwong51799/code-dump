/* Christopher Wong (#111386693)
 * CSE 114
 * Lab Section 05
 */
public class SuperCircle {
	double radius;
	public SuperCircle(double r) {
		radius = r;
	}
	public double getPerimeter() {
		return (2*Math.PI*radius);
	}
	public double getArea() {
		return (Math.PI*Math.pow(radius, 2));
	}
	public static void main(String[] args) {
		Cylinder cy1 = new Cylinder(3, 5);
		SuperCircle ci1 = new SuperCircle(3);
		System.out.println("Cylinder\nArea:"+cy1.getArea()+"\nVolume:"+cy1.getVolume());
		System.out.println("Circle\nArea:"+ci1.getArea()+"\nPerimeter:"+ci1.getPerimeter());
	}
}
	class Cylinder extends SuperCircle {
		public Cylinder(double r, double l) {
		super(r);
		length = l;
		}
		private double circleArea = Math.PI*radius*radius;
		private double length;
		public double getArea() {
			return (2*circleArea + (2*Math.PI*radius*length));
		}
		public double getVolume() {
			return (Math.PI*Math.pow(radius, 2)*length);
		}
}

/* Christopher Wong (#111386693)
 * CSE 114
 * Lab Section 05
 */
public class RegularPolygon {
	private int n;
	private double side, x, y;
	public RegularPolygon() {
		n = 3;
		side = 1;
		x = 0;
		y = 0;
	}
	public RegularPolygon(int newN, double newSide) {
		n = newN;
		side = newSide;
		x = 0;
		y = 0;
	}
	public RegularPolygon(int newN, double newSide, double newX, double newY) {
		n = newN;
		side = newSide;
		x = newX;
		y = newY;
	}
	public int getN() {
		return n;
	}
	public double getSide() {
		return side;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public void setN(int newN) {
		n = newN;
	}
	public void setSide(double newSide) {
		side = newSide;
	}
	public void setX(double newX) {
		x = newX;
	}
	public void setY(double newY) {
		y = newY;
	}
	public double getPerimeter() {
		return (side*n);
	}
	public double getArea() {
		return ((n * Math.pow(side, 2))/ (4*Math.tan((Math.PI)/n)));
	}
	public static void main(String[] args) {
		RegularPolygon Polygon1 = new RegularPolygon();
		RegularPolygon Polygon2 = new RegularPolygon(6,4);
		RegularPolygon Polygon3 = new RegularPolygon(10,4,5.6,7.8);
		System.out.println("Polygon 1:");
		System.out.println(Polygon1.getPerimeter());
		System.out.println(Polygon1.getArea());
		System.out.println("Polygon 2:");
		System.out.println(Polygon2.getPerimeter());
		System.out.println(Polygon2.getArea());
		System.out.println("Polygon 3:");
		System.out.println(Polygon3.getPerimeter());
		System.out.println(Polygon3.getArea());
	}
}

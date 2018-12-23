/* Christopher Wong (#111386693)
 * CSE 114
 * Lab Section 05
 */
import java.util.Scanner;
public class LinearEquation {
	private double a,b,c,d,e,f;
	public LinearEquation (double newA, double newB, double newC, double newD, double newE, double newF){
		a = newA; b = newB; c = newC; d = newD; e = newE; f = newF;
	}
	public double getA() { return a;}
	public double getB() { return b;}
	public double getC() { return c;}
	public double getD() { return d;}
	public double getE() { return e;}
	public double getF() { return f;}
	public boolean isSolvable() {
		if (a*d - b*c != 0)
			return true;
		else
			return false;
		}
	public double getX() {
		return ((e*d - b*f) / (a*d - b*c));
	}
	public double getY() {
		return ((a*f - e*c) / (a*d - b*c));
	}
public static void main (String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a,b,c,d,e,f:");
	double a = input.nextDouble();
	double b = input.nextDouble();
	double c = input.nextDouble();
	double d = input.nextDouble();
	double e = input.nextDouble();
	double f = input.nextDouble();
	LinearEquation LE = new LinearEquation(a,b,c,d,e,f);
	if (LE.a * LE.d - LE.b * LE.c  != 0) 
	System.out.println("X is "+LE.getX()+" and Y is "+LE.getY());
	if (LE.a * LE.d - LE.b * LE.c  == 0)
		System.out.println("The equation has no solutions.");
	input.close();
	}
}

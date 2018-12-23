/* Christopher Wong
 * CSE 114
 * 111386693
 * Lab Setion 05
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class QuadraticEquation {
	private double a,b,c;
	public QuadraticEquation(double newA, double newB, double newC) {
		a = newA;
		b = newB;
		c = newC;
	}
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}	
	public double getDiscriminant() {
		return (b*b - 4*a*c);
	}
	public double getRoot1() {
		return (-b + Math.pow(b*b-4*a*c,.5))/(2*a);
	}
	public double getRoot2() {
		return (-b - Math.pow(b*b-4*a*c,.5))/(2*a);
	}
public static void main (String[] args) {
	DecimalFormat df = new DecimalFormat("###.0#####");
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a,b,c: ");
	double a,b,c;
	a = input.nextDouble();
	b = input.nextDouble();
	c = input.nextDouble();
	QuadraticEquation myQuad = new QuadraticEquation(a, b, c);
	if (myQuad.getDiscriminant() > 0)
		System.out.print("The equation has a two roots "+df.format(myQuad.getRoot1()) + " and " + df.format(myQuad.getRoot2()));
	else if (myQuad.getDiscriminant() == 0)
		System.out.print("The equation has one root "+df.format(myQuad.getRoot1()));
	else
		System.out.print("The equation has no roots.");		
	input.close();
	}
}
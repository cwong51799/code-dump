/* CSE 114
 * Christopher Wong
 * 11136693
 * Lab Section 05
 */
import java.util.Scanner;
import java.lang.Math;
public class Lab3 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a,b,c: ");
		float a = input.nextFloat();
		float b = input.nextFloat();
		float c = input.nextFloat();
		float discriminant = (b*b)-(4*a*c);
		double check = Math.pow((b*b)-(4*a*c), .5);
		if (discriminant > 0) {
			double r1 = ((0-b) + check) / (2*a);
			double r2 = ((0-b) - check) / (2*a);
				System.out.print("The equation has two roots "+r1+" and "+r2);
		}
		else if (discriminant == 0) {
			double r1 = ((0-b) + check) / (2*a);
				System.out.print("The equation has one root "+r1);
		}
				else {
					System.out.print("The equation has no real roots.");
				}		
		input.close();
		}	
	}

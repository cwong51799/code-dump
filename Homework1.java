/* Christopher Wong (#111386693)
 * CSE 114
 * Lab Section 05
 */
import java.util.Scanner;
public class Homework1 {
	public static void main (String [] args) {
	Scanner input = new Scanner (System.in);
	System.out.println("Enter the length of each side of a triangle: ");
	double s1 = input.nextDouble();
	double s2 = input.nextDouble();
	double s3 = input.nextDouble();
	if (((s1 + s2) > s3) && ((s2 + s3) > s1) && ((s1 + s3) > s2)) 
		System.out.println("The triangle's perimeter is "+(s1+s2+s3));
		else
			System.out.println("The input is invalid.");
	input.close ();
	}
}

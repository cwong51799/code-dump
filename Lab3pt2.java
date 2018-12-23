/* CSE 114
 * Christopher Wong
 * 11136693
 * Lab Section 05
 */
import java.util.Scanner;
public class Lab3pt2 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the weight of the package: ");
		float weight = input.nextFloat();
		if (0<weight && weight<=1) 
			System.out.println("The shipping cost will be $3.50");
		if (1<weight && weight <=3)
			System.out.println("The shipping cost will be $5.50");
		if (3<weight && weight <=10)
			System.out.println("The shipping cost will be $8.50");
		if (10 < weight && weight <= 20)
			System.out.println("The shipping cost will be $10.50");
		if (weight <= 0)
			System.out.println("Invalid input.");
		if (weight >20)
			System.out.println("The package cannot be shipped.");
		input.close();
	}		
}

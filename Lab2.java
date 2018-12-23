/* CSE 114
   Christopher Wong
   111386693
   Lab Section 05
*/
import java.util.Scanner;
public class Lab2 {
	public static void main(String[] args) {
		Scanner suh = new Scanner(System.in);
		System.out.println("Enter v0, v1 and t: ");
		double v0 = suh.nextDouble();
		double v1 = suh.nextDouble();
		double t = suh.nextDouble();
		double answer = (v1-v0)/t;
		System.out.println("The average acceleration is "+answer +"!");
		suh.close();	
	}
}

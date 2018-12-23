/* Christopher Wong (#111386693)
 * CSE 114
 * Lab Section 05
 */
import java.util.Scanner;
public class Lab4 {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a three-digit integer: ");
		int x = input.nextInt();
		if (x >= 100 && x<=1000) {
			int lastdigit = x % 10;
			int firstdigit = ((x - (x % 100)) / 100);
			if (firstdigit == lastdigit)
				System.out.println(x +" is a palindrome.");
			else 
				System.out.println(x +" is not a palindrome.");
		input.close();
		}
		else
			System.out.println("That's not a three digit integer.");
	}	
		
	}

/* CSE 114
 * Christopher Wong (#111386693)
 * Lab Section 05
 */
import java.util.Scanner;
public class Homework1pt4 {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a string: ");
		String myString = new String (input.nextLine());
		int length = myString.length();
		int upperCaseLetters = 0;
		int i = 0;
		while (i < length) {
			if (myString.charAt(i) >='A' && myString.charAt(i) <='Z')
				upperCaseLetters += 1;
			i += 1;
		}
		System.out.print("The number of uppercase letters is " +upperCaseLetters);
		input.close();
	}
}

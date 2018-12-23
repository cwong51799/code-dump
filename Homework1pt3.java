/* CSE 114
 * Christopher Wong (#111386693)
 * Lab Section 05
 */
import java.util.Scanner;
public class Homework1pt3 {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a string: ");
		String myString = new String(input.nextLine());
		myString = myString.toLowerCase();
		int length = myString.length();
		int vowels = 0;
		int consonants = 0;
		int i = 0;
		while (i < length) {
			if (myString.charAt(i) == ' ') {}
			else if (myString.charAt(i) == 'a' || myString.charAt(i) == 'e' || myString.charAt(i) == 'i' || myString.charAt(i) == 'o' || myString.charAt(i) == 'u')
				vowels += 1;
				else 
					consonants += 1;
			i += 1;
		}
		System.out.println("The number of vowels is " +vowels);
		System.out.println("The number of consonants is "+consonants);
	input.close();
	}
}


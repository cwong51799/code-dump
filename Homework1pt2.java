/* CSE 114
 * Christopher Wong (#111386693)
 * Lab Section 05
 */
import java.util.Scanner;
public class Homework1pt2 {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a letter: ");
		String letter = new String (input.next());
		String lowerletter = letter.toLowerCase();
		char hello = lowerletter.charAt(0);
		if (hello == 'a' || hello == 'e' || hello == 'i' || hello == 'o' || hello == 'u') {
				System.out.print(letter +" is a vowel.");}
		else if (hello == 'b' || hello == 'c' || hello == 'd' || hello == 'f' || hello == 'g' || hello == 'h' || hello == 'j' || hello == 'k' || hello == 'l' || hello == 'm' || hello == 'n' || hello == 'p' || hello == 'q' || hello == 'r' || hello == 's' || hello == 't' || hello == 'v' || hello == 'w' || hello == 'x' || hello == 'y' || hello == 'z') {
				System.out.print(letter +" is a consonant.");}
				else {
					System.out.print(letter + " is an invalid input.");
		input.close();
				}
		}
}

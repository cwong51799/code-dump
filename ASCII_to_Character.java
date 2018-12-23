/* CSE 114
 * Christopher Wong (#111386693)
 * Lab Section 05
 */
import java.util.Scanner;
public class ASCII_to_Character {
	public static void main (String[] args) {
	Scanner input = new Scanner (System.in);
	System.out.print("Enter an ASCII code: ");
	int ascii = input.nextInt();
	char character = (char) ascii;
	System.out.println("The character for ASCII code " + ascii + " is " +character);
	input.close();
}
}
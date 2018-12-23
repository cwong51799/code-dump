/* CSE 114
 * Christopher Wong
 * 111386693
 * Lab Section 05
 */
import java.util.Scanner;
public class Palindrome {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the input string: ");
		String x = input.nextLine();
		input.close();
		palindrome (x);
	}
	public static void palindrome (String spaceStr) {
		String newStr = spaceStr.toLowerCase();
		String Str = "";
		for (int i = 0; i < spaceStr.length(); i++) {
			if (newStr.charAt(i) != ' ')
				Str+= newStr.charAt(i);
		}
		int RtL = 1;
		int check = 0;
		for (int i = 0; i < Str.length(); i++) {
			if (Str.charAt(i) == (Str.charAt(Str.length()- RtL))) {
				++RtL;
			}
			else {
				System.out.print("Input string " + spaceStr + " is not a palindrome");
				check = 1;
				break;
			}
		}
		if (check == 0)
		System.out.print("Input string " + spaceStr + " is a palindrome");
		}
	}


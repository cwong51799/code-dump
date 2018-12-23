/* CSE 114
 * Christopher Wong
 * 111386693
 * Lab Section 05
 */
import java.util.Scanner;
public class StarPyramid {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the value of n: ");
		int lines = input.nextInt();
		input.close();
		starsTriangle (lines);
	}
	public static void starsTriangle(int num) {
			String spaces = new String ();
			String stars = new String ();
			for (int j = num; j > 0; j --) { // the amount of lines that there are ( the input)
				for (int i = 0; i < j; i++)  // adds the correct amount of spaces, gets reset at the end.
					spaces += ' ';  
				stars += "* "; // adds the correct amount of stars, does not get reset.
				System.out.println(spaces + stars + spaces);
				spaces = "";
			}
			
			

			
		}
	}

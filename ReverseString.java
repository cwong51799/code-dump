/* CSE 114
 * Christopher Wong
 * 111386693
 * Lab Section 05
 */
import java.util.Scanner;
public class ReverseString {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Input the string: ");
		String normal = input.nextLine();
		String x = reverse (normal);
		System.out.print(x);
		input.close();
	}
	public static String reverse(String st) {
		String reverse = "";
		for (int i = (st.length()-1); i >= 0; i--) {
			char letter = st.charAt(i);
			reverse += letter;
		}
		return reverse
				;
	}
		
	
}

/* CSE 114
 * Christopher Wong
 * 111386693
 * Lab Section 05
 */
import java.util.Scanner;
public class Factorial {
	public static void main (String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a positive integer: ");
	int i = input.nextInt();
	long answer = i;
	i --;
	for (;i > 0; i--) {
		answer *= i;
	}
	input.close();
	System.out.print("Factorial is: " +answer);
	}
}

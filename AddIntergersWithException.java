/* Christopher Wong(#111386693)
 * CSE 114
 * Lab Section 05 */
import java.util.*;
public class AddIntergersWithException {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;
		do {
			try {
				System.out.print("Enter the first integer: ");
				int int1 = input.nextInt();
				System.out.print("Enter the second integer: ");
				int int2 = input.nextInt();
				continueInput = false;
				System.out.print(int1 + int2);
			}
			catch (InputMismatchException ex) {
				System.out.println("Your input is invalid. Please try again");
				input.nextLine();
			}
		} while (continueInput);
		input.close();
	}
}

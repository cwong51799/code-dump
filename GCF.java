import java.util.Scanner;
public class GCF {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first integer: ");
		int int1 = input.nextInt();
		System.out.print("Enter the second integer: ");
		int int2 = input.nextInt();
		input.close();
		int highest = (int1 > int2) ? int1 : int2; // << this line was thought of by Izan Huang 111504341
		int gcf = 1;
		for (int i = highest; i > 0 ;i--) { // this line was inspired by Izan Huang, but mostly generated by yours truly.
			if (int1 % i == 0 && int2 % i == 0) {
				gcf = i;
				break;
			}
		}
		System.out.print("The greatest common divisor is: " + gcf);		
		}
	}

/* Christopher Wong(#111386693)
 * CSE 114
 * Lab Section 05 */
import java.util.*;
public class RandomArrayWithBoundsException {
	public static void main(String[] args) {
		int[] a = new int[100];
		for (int i=0;i<a.length;i++) {
			int roll = (int)(Math.random()*100) + 1;
			a[i] = roll;
		}
		Scanner input = new Scanner (System.in);
		System.out.print("Enter an index of the array: ");
		try {
			int index = input.nextInt();
			System.out.print(a[index]);
		}
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.print("Out of Bounds");
		}
		input.close();
	}
}

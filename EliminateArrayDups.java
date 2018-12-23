/* CSE 114
 * Christopher Wong
 * 111386693
 * Lab Section 05
 */
import java.util.Scanner;
public class EliminateArrayDups {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		int [] array = new int [10];
		System.out.print("Enter 10 numbers: ");
		for (int i = 0; i < 10; i++)
			array[i] = (input.nextInt());
		input.close();
		array = eliminateDuplicate(array);
		System.out.print("The distinct numbers are: ");
		for (int i = 0; i <array.length ; i++)
			if (array[i] != 0)
				System.out.print(array[i] + " ");
	}
	public static int[] eliminateDuplicate(int[] list) {
		String Dups = "";
		int [] distinctNums = new int [10];
		int position = 0;
		for (int i = 0; i < list.length; i++) {
			if (Dups.indexOf((char)list[i]) >= 0)
				continue;
			Dups += (char)list[i];
			distinctNums[position] = list[i];
			position ++;
		}
	return (distinctNums);
	}
}

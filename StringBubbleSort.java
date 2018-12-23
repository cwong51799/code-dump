/* Christopher Wong (#111386693)
 * CSE 114
 */
import java.util.Scanner;
public class StringBubbleSort {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter 10 strings: ");
		String x = input.nextLine();
		String [] str1 = x.split(","); 
		str1[0] = " " + str1[0];
		input.close();
		String[] answer = bubblesort (str1);
		System.out.print("Sorted strings: " );
		for (int i = 0; i< 10;i++)
			System.out.print(answer[i] + ", ");
		}
	public static String[] bubblesort (String[] str1) {
		String p; // placeholder
		for (int i=0; i<str1.length;i++) { // 10 times
			for (int j = 0; j<str1.length-1; j++) { // 10 times
				if (str1[j].compareTo(str1[j+1]) > 0) {
					p = str1[j+1];
					str1[j+1] = str1[j];
					str1[j] = p;
			}
			}
		}
		return (str1);
	}
}


/* Christopher Wong (#111386693)
 * CSE 114
 * Lab Section 5
 */
import java.util.Arrays;
import java.util.Scanner;
public class TwoListsSorted {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter list1 size and contents: ");
		String list1 = input.nextLine(); // the list with the size
		System.out.print("Enter list2 size and contents: ");
		String list2 = input.nextLine();
		input.close();
		String [] StrArray1 = list1.split(" "); // an array of list1's elements
		String [] StrArray2 = list2.split(" "); // an array of list2's elements
		int [] array1 = new int [list1.charAt(0)-'0'];
		int [] array2 = new int [list2.charAt(0)-'0'];
		int position = 0;
		for (int i=1; i <= array1.length; i++) { // turn into int array
			array1[position] = Integer.parseInt(StrArray1[i]);
			position++;
		}
		position = 0;
		for (int i=1; i <= array2.length; i++) {
			array2[position] = Integer.parseInt(StrArray2[i]);
			position++;
		}
		int[] answer = merge(array1, array2);
			for (int i = 0; i < answer.length; i++)
				System.out.print(answer[i] + " ");
	}
		public static int[] merge(int[] array1, int[] array2) {
			System.out.println(Arrays.toString(array1));
			System.out.println(Arrays.toString(array2));
			int [] array3 = new int[array1.length + array2.length];
			int position = 0;
			int p; // placeholder
			for (int i = 0; i < array1.length; i++) { // adds array1
					array3[position] = array1[i]; // adds int version of array1's string to array3
					position++;
				}
			for (int i = 0; i < array2.length; i++) { // adds array1
					array3[position] = array2[i];
					position++;
			}
			for (int i = 0; i < array3.length - 1; i++) { // the sort
				for (int j = 1; j < array3.length; j++) {
						if (array3[j] <= array3[j-1]) {
							p = array3[j-1];
							array3[j-1] = array3[j];
							array3[j] = p;
						}
					}
				}
			return (array3);
			
	
		
		
			}
		
	}

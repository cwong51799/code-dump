import java.util.Scanner;
public class FibonaccisSequence {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the length of the sequence: ");
		int j = input.nextInt();
		input.close();
		fibonacci (j);
	}
		public static int [] fibonacci (int n) {
			int [] array = new int[n];
			if (n == 1) {
				array[0] = 0;
				System.out.print(array[0]);
				return (array);
			}
			if (n == 2) {
				array[0] = 0;
				array[1] = 1;
				System.out.print(array[0] + " " + array[1]);
				return (array);
			}
			array[0] = 0;
			array[1] = 1;
			for (int i = 2; i < n; i++) {
				array[i] = array[i-1] + array[i-2];
			}
			for (int i = 0; i <array.length ; i++)
					System.out.print(array[i] + " ");
			return (array);
				
			
		
		
		}
	}

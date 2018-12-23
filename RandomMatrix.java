/* Christopher Wong (#111386693)
 * Lab Section 05
 * CSE 114
 */
import java.util.Scanner;
import java.util.ArrayList;
public class RandomMatrix {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the array size n: ");
		int size = input.nextInt();
		input.close();
		int[][] m = new int[size][size];
		for (int i=0;i<size;i++) { //fills it in
			for (int j=0;j<size;j++) {
				int roll = (int)(Math.random()*100);
				if (roll<50)
					m[i][j] = 1;
				else
					m[i][j] = 0;
			}
		}
		int count = 0;
		int highest = 0;
		ArrayList<Integer> rows = new ArrayList<Integer>();
		ArrayList<Integer> columns = new ArrayList<Integer>();
			for (int i=0;i<size;i++) { // find highest row count;
				for (int j=0;j<size;j++) {
					if (m[i][j] == 1)
						count++;
				}
				if (count>highest) {
					highest = count;
				}
				count = 0;
			}
			for (int i=0;i<size;i++) { //check each if they match the highest
				for (int j=0;j<size;j++) {
					if (m[i][j] == 1)
						count++;
				}
				if (count==highest) {
					rows.add(i);
				}
				count = 0;
			}	
		for (int j=0;j<size;j++) { //find highest column count
			for (int i=0;i<size;i++) {
				if (m[i][j] == 1)
					count++;
			}
			if (count>highest) {
				highest = count;
			}
			count = 0;
		}
		for (int j=0;j<size;j++) { //check each if they match the highest
			for (int i=0;i<size;i++) {
				if (m[i][j] == 1)
					count++;
			}
			if (count==highest) {
				columns.add(j);
			}
			count = 0;
		}
		System.out.println("The random array is");
		for (int i=0;i<size;i++) {
			for (int j=0;j<size;j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
			}
		System.out.print("The largest row index: ");
		for (int i=0;i<rows.size();i++) {
			System.out.print(rows.get(i) +", ");
		}
		System.out.println();
		System.out.print("The largest column index: ");
		for (int i=0;i<columns.size();i++) {
			System.out.print(columns.get(i) + " ");
		}
		}
	}
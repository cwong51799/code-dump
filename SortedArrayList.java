import java.util.Scanner;
import java.util.ArrayList;
public class SortedArrayList {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter five integers: ");
		ArrayList<Integer> aL = new ArrayList<Integer>(5);
		for (int i=0;i<5;i++)
			aL.add(input.nextInt());
		input.close();
		sort(aL);
	}
	public static void sort(ArrayList<Integer> list) {
		for (int i=0;i<6;i++) {
			for (int j=0;j<4;j++) {
				if (list.get(j) > list.get(j+1)){
					list.add(list.get(j));
					list.remove(j);
				}
			}
		}
		for (int l=0;l<5;l++) {
			System.out.print(list.get(l) + " ");
		}
	}
}

/* Christopher Wong (#111386693)
 * CSE 114
 * Lab Section 05
 */
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListRemoveDup {
	public static void main(String[] args) {
		ArrayList<Integer> intArr= new ArrayList<Integer>(10);
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 integers: ");
		for (int i=0;i<10;i++)
			intArr.add(input.nextInt());
		input.close();
		removeDuplicate(intArr);
	}
	public static void removeDuplicate(ArrayList<Integer> list) {
		ArrayList<Integer> checker = new ArrayList<Integer>(10);
			for (int i=0;i<list.size();i++) {
				boolean isDup = false;
				for (int j=0;j<checker.size();j++) {
						if (list.get(i) == checker.get(j)) {
							isDup = true;
						}
				}
				if (isDup == true) {
					list.remove(i);
					i--;
					//0 1 2 3
					//[1,1,1]
				}
				if (isDup == false) {
					checker.add(list.get(i));
			}
		}
		System.out.print("The distinct integers are: ");
		for (int i=0;i<list.size();i++) {
			System.out.print(list.get(i) +" ");
		}
	}
	}
// 34 5 3 5 6 4 33 2 2 4
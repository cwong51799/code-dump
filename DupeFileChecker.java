/* Christopher Wong (#111386693)
 * CSE 114
 * Lab Section 5
 */
import java.util.*;
import java.io.*;
public class DupeFileChecker {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		ArrayList<String> a2 = new ArrayList<String>();
		System.out.println("Enter the first file name: ");
		Scanner input = new Scanner(System.in);
		File f1 = new File (input.nextLine());
		System.out.println("Enter the second file name: ");
		File f2 = new File(input.nextLine());
		input.close();
		try {
		Scanner sc1 = new Scanner(f1);
		Scanner sc2 = new Scanner(f2);
		while (sc1.hasNextLine()) {
			a1.add(sc1.nextLine());
		}
		while (sc2.hasNextLine()) {
			a2.add(sc2.nextLine());
		}
		sc1.close();
		sc2.close();
		System.out.println(Arrays.toString(a1.toArray()));
		System.out.println(Arrays.toString(a2.toArray()));
		int lineDifference = 0;
		boolean identical = true;
		int size = a1.size() < a2.size() ? a1.size() : a2.size();
		if (a1.size() < a2.size()) {
			lineDifference = a2.size() - a1.size();
			identical = false;
		}
		if (a2.size() < a1.size()) {
			lineDifference = a1.size() - a2.size();
			identical = false;
		}
		int linesOff = 0;
		for (int i=0;i<size;i++) {
			if (a1.get(i).compareTo(a2.get(i)) != 0) {
				identical = false;
				linesOff++;
		}
		}
		int totalLineDifference = linesOff + lineDifference;
		if (identical == true) {
			System.out.println("The files are identical.");
		}
		else {
			System.out.println("The files are not identical. There are "+totalLineDifference+" lines that are different.");
		}
		}
		catch(IOException ex) {
			System.out.println("Something went wrong. Please restart the program and try again.");
		}

	}
}

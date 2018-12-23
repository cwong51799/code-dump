/* CSE 114
 * Christopher Wong
 * 111386693
 * Lab Section 05
 */
import java.util.Scanner;
public class Anagrams {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the first string: ");
		String str1 = input.nextLine();
		System.out.print("Enter the second string: ");
		String str2 = input.nextLine();
		anagrams (str1, str2);
		input.close();
	}
	public static void anagrams (String Oinput1, String Oinput2) {
		Oinput1 = Oinput1.toLowerCase();
		Oinput2 = Oinput2.toLowerCase();
		String input1 = "";
		String input2 = "";
		for (int p = 0; p < Oinput1.length(); p++) {
			if (Oinput1.charAt(p) != ' ')
				input1 += Oinput1.charAt(p);
		}
		for (int p= 0; p < Oinput2.length(); p++) {
				if (Oinput2.charAt(p) != ' ')
					input2 += Oinput2.charAt(p);
		}
		char [] array1= new char [input1.length()];
		char [] array2= new char [input2.length()];
		int check = 0;
		for (int p = 0; p < array1.length; p++)
			array1[p] = input1.charAt(p);
		for (int p = 0; p < array2.length; p++)
			array2[p] = input2.charAt(p);
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j])
					array2[j] = '0';
			}
		}
		for (int i = 0; i < array2.length;i++) {
			if (array2[i] != '0') {
				check = 1;
				break;
			}
		}
		if (check == 0)
			System.out.print(Oinput1 + " and " + Oinput2 + " are anagrams");
		else
			System.out.print(Oinput1 + " and " + Oinput2 + " are NOT anagrams");
		}
	}


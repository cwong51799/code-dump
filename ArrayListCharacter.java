/* Christopher Wong (#111386693)
 * CSE 114
 * Lab Section 05
 */
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListCharacter {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the input string: ");
		String str = input.nextLine();
		input.close();
		ArrayList<Character> answer = toCharacterArray(str);
		System.out.print("Elements of the Character array list: ");
		for (Character i:answer) {
			System.out.print(i);
		}
	}
		public static ArrayList<Character> toCharacterArray(String s){
			ArrayList<Character> arrL = new ArrayList<Character>(s.length());
			for (int i=0;i<s.length();i++) {
				arrL.add(s.charAt(i));
				arrL.add(' ');
			}
		return (arrL);
		}
	}


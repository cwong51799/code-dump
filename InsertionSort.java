
public class InsertionSort {
	public static void main (String[] args) {
		String str = "I LIKE CSE 114";
		String str2 = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ')
				str2 += ' ';
			else
				str2 += (char)(str.charAt(i) + 3);
			}
		System.out.print(str2);
		}
	}
		

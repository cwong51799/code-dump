/* CSE 114
 * Christopher Wong
 * 111386693
 * Lab Section 05
 */
public class AvgOf10RandInt {
	public static void main (String[] args) {
		double added = 0;
		for (int i = 0; i < 10; i++) {
			int result = (int)(Math.random() * 100);	
			added += result;
		}
		double answer = added / 10;
		System.out.print(answer);
	}
}

/* CSE 114
 * Christopher Wong (#111386693)
 * Lab Section 05
 */

public class RandomIntCount {
	public static void main (String[] args) {
	int x;
	int[] arr = new int [10];
	for (int i=0; i<100;i++) {
		x = (int)(Math.random() * 10);
		arr[x] ++;
		}
	for (int i =0; i<arr.length; i++)
	System.out.print(i + ":" +arr[i]+", ");
	}
}

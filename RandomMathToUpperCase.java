/* CSE 114
 * Christopher Wong (#111386693)
 * Lab Section 05
 */
public class RandomMathToUpperCase {
	public static void main (String[] args) {;
	double x = Math.random();
	x *= 25;
	double roundedX = Math.round(x);
	int randInt = (int)roundedX;
	int answer = 65 + randInt;
	System.out.println((char)answer); 
	}
}

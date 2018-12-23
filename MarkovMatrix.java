/* Christopher Wong (#111386693)
 * CSE 114
 * Lab Section 5
 */
import java.util.Scanner;
public class MarkovMatrix {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a 3-by-3 matric by row: ");
		double[][] first = new double[3][3];
		for (int j=0;j<3;j++) {
			for (int i=0;i<3;i++) {
				first[j][i] = input.nextDouble();
			}
		}
		if (isMarkovMatrix(first) == true)
			System.out.println("It is a Markov matrix.");
		else
			System.out.println("It is not a Markov matrix.");
		input.close();
	}
	public static boolean isMarkovMatrix(double[][]m) {
		double total = 0;
		boolean answer;
		for (int j=0;j<3;j++) {
			for (int i=0;i<3;i++) {
				if (m[j][i] > 0) {
					total+=m[j][i];
				}else{
					answer = false;
					return (answer);
				}
			}
		}
		if (Math.round(total)==3) {
			answer = true;
			return (answer);
		}else
			answer = false;
			return (answer);
	}
}
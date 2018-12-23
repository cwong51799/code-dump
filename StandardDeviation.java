/* CSE 114
 * Christopher Wong
 * 111386693
 * Lab Section 09
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class StandardDeviation {
	public static void main (String[] args) {
		DecimalFormat df = new DecimalFormat ("0.#####");
		Scanner input = new Scanner (System.in);
		double [] array = new double [10];
		System.out.print("Enter 10 numbers: ");
		for (int i = 0; i < 10; i++)
			array[i] = (input.nextDouble());
		input.close();
		System.out.println("The mean is " + df.format(mean(array)));
		System.out.println("The standard deviation is " + df.format(deviation(array)));
	}
	public static double mean(double[] x) {
		double total = 0;
		double mean;
		for (int i = 0; i < x.length; i++) 
			total += x[i];
		mean = total / x.length;
		return mean;
	}
	public static double deviation (double[] x) {
		double deviation;
		double sigma = 0;
		for (int i = 0; i < x.length; i++) 
			sigma += Math.pow(x[i] - mean(x), 2); 
		deviation = Math.pow((sigma / (x.length-1)), 0.5);
		return deviation;
	}
}

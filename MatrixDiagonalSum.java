/* Christopher Wong
 * CSE 114
 * 111386693
 * Lab Setion 05
 */
import java.util.Scanner;
public class MatrixDiagonalSum {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a 4-by-4 matrix row by row:");
		double[][] m = new double[4][4];
		for (int i=0; i<m.length;i++) 
			for (int j=0;j<m[i].length;j++) 
				m[i][j] = input.nextDouble();
		System.out.print("Sum of the elements in the major diagonal is " + sumMajorDiagonal(m));
		input.close();
	}
	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0;
		for (int i=0; i<m.length;i++)
			sum += m[i][i];
		return sum;
	}
}

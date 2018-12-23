/* Christopher Wong (#111386693)
 * CSE 114
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class MultiplyTwoMatrices {
	public static void main (String[] args) {
		DecimalFormat df = new DecimalFormat ("####.#");
		Scanner input = new Scanner (System.in);
		double[][] matrix1 = new double[3][3];
		System.out.print("Enter matrix1: ");
		for (int i=0; i < 3; i++) 
			for (int j=0; j < 3; j++) 
				matrix1[i][j] = input.nextDouble();
		double[][] matrix2 = new double[3][3];
		System.out.print("Enter matrix2: ");
		for (int i=0; i < 3; i++) 
			for (int j=0; j < 3; j++) 
				matrix2[i][j] = input.nextDouble();
		input.close();
		double[][] c = multiplyMatrix(matrix1, matrix2);
		System.out.println("Multiplication of the matrices is: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(df.format(c[i][j]) + " ");
			}
			System.out.println();
		}
		}
	public static double[][] multiplyMatrix(double[][] a, double[][] b){
		// a[0][0] * b[0][0] + a[1][0] * b[0][1] + a[2][0] * b[0][2]
		// a[0][0] * b[1][0] + a[1][0] * b[1][1] + a[2][0] * b[1][2]
		
		// a[0][1] * b[0][0] + a[1][1] * b[0][1] + a[2][1] * b[0][2]
		// a[0][1] * b[1][0] + a[1][1] * b[1][1] + a[2][1] * b[1][2]
		double[][] c = new double[3][3];
		for (int n = 0; n < 3; n++) {
			for (int j = 0; j < 3; j++) {
				for (int i = 0; i < 3; i++) {
					c[n][j] += a[n][i] * b[i][j];
				}
			}
		}
		
		return (c);
	}
// 1 2 3 4 5 6 7 8 9
// 0 2 4 1 4.5 2.2 1.1 4.3 5.2
}

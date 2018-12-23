/* Christopher Wong (#111386693)
 * CSE 114
 * Lab Section 05
 */
import java.io.*;
import java.util.*;
public class ScoreReader {
	public static void main(String[] args) {
		double total = 0;
		int count = 0;
		Scanner input = new Scanner(System.in);
		try {
		System.out.println("Enter the file: ");
		String filename = input.nextLine();
		File f = new File (filename);
		// ???? Is entering the name of the file != entering the file?
		Scanner sc = new Scanner(f);
		while (sc.hasNextDouble()) {
			total+= sc.nextDouble();
			count++;
		}
		sc.close();
		input.close();
		System.out.print("The total score is "+total+" and the average is " +(total/count));
	}
		catch(IOException ioe){
		}
	}
}

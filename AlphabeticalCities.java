/* Christopher Wong (#111386693)
 * CSE 114
 * Lab Section 05
 */
import java.util.Scanner;
public class AlphabeticalCities {
	public static void main (String[] args) {		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first city: ");
		String city1 = new String(input.nextLine());
		System.out.print("Enter the second city: ");
		String city2 = new String(input.nextLine());
		System.out.print("Enter the third city: ");
		String city3 = new String(input.nextLine());
		String a = new String();
		String b = new String();
		String c = new String();
		String p = new String();
		if ((city1.compareToIgnoreCase(city2) < 0) && (city1.compareToIgnoreCase(city3) < 0)) {
			a = city1;
			b = city2;
			c = city3;
		}
			else if ((city2.compareToIgnoreCase(city3) < 0)){
				c = city1;
				a = city2;
				b = city3;
			}
			else if ((city2.compareToIgnoreCase(city3) > 0)){
				c = city1;
				a = city3;
				b = city2;
			}
		if ((b.compareToIgnoreCase(c) > 0)) {
			p = b;
			b = c;
			c = p;
		}
		input.close();
		System.out.println("The three cities in alphabetical order are " +a+ " "+b+" " +c);
		}
	}

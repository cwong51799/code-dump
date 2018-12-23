/* Christopher Wong (#111386693)
 * CSE 114
 * Lab Section 05
 */
public class Lab4pt2 {
	public static void main (String [] args) {
		double x = Math.random();
		int RandInt;
		RandInt = ((int)(12*x))+1;
		switch (RandInt) {
		case 1: System.out.println("January");
				break;
		case 2: System.out.println("February");
		        break;
		case 3: System.out.println("March");
				break;
		case 4: System.out.println("April");
				break;
		case 5: System.out.println("May");
				break;
		case 6: System.out.println("June");
				break;
		case 7: System.out.println("July");
				break;
		case 8: System.out.println("August");
				break;
		case 9: System.out.println("September");
				break;
		case 10: System.out.println("October");
				break;
		case 11: System.out.println("November");
				break;
		case 12: System.out.println("December");
				break;
		default: System.out.println("Something went wrong!");
		}
	}
}

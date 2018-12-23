/* Christopher Wong (#111386693)
 * CSE 114
 * Lab Section 05
 */
public class LicensePlate {
	public static void main (String[] args) {
		String Plate = new String();
		for (int i = 0; i< 3; i++) {
			Plate = Plate + ((char)(Math.random()*26 + 'A'));
		}	
		for (int o = 0; o < 4; o++) {
			Plate = Plate + ((int)(Math.random()*10));
		}
		System.out.print(Plate);
		}
	}

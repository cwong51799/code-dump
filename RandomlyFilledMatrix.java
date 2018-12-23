/* Christopher Wong (#111386693)
 * CSE 114
 * Lab Section 05
 */
public class RandomlyFilledMatrix {
	public static void main(String[] args) {
	int[][] m = new int [4][4];
	for (int i=0;i<4;i++) {
		for (int j=0;j<m[i].length;j++) {
			int roll = (int)(Math.random() * 10);
			if (roll<5)
				m[i][j] = 0;
			else if (roll<10)
				m[i][j] = 1;
		}
	}
	for (int i=0; i<4; i++) {
		for (int j=0; j<4; j++) 
			System.out.print(m[i][j]);
		System.out.print("\n");
	}
	int row = 0;
	int highest = 0;
	int count = 0;
	for (int i=0; i<4;i++) {
		for (int j=0; j<4;j++) {
			if (m[i][j] == 1)
				count++;
		}
		if (count > highest) {
			highest = count;
			row = i;
		}
		count = 0;
	}
	System.out.println("The largest row index: " + row);
	highest = 0;
	int column = 0;
	for (int i=0; i<4;i++) {
		for (int j=0; j<4;j++) {
			if (m[j][i] == 1)
				count++;
		}
		if (count > highest) {
			column = i;
			highest = count;
		}
		count = 0;
		}
	System.out.println("The largest column index: " + column);
	}
}

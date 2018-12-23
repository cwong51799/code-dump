/* Christopher Wong (#111386693)
 * CSE 114
 * Lab Section 05
 */
import java.util.ArrayList;
import java.util.Scanner;
public class test {
	public static int i=5;
	public int o;
	public test(int i) {
		this.i = i;
	}
public static void main(String[] args) {
		test a = new test(1);	
		test b = new test(3);
		System.out.println(test.i);
		System.out.println(a.o);
		System.out.println(a.i);
	}
}
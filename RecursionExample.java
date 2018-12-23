
public class RecursionExample {
	public static void main(String[] args) {
		up_and_down(1);
	}
public static void up_and_down(int n) {
	System.out.println("Level:" + n);
	if (n < 4) {
		up_and_down(n+1);
		System.out.println("End");
	}
	System.out.println("LEVEL:" + n);
}
}

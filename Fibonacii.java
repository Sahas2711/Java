
import java.util.Scanner;

public class Fibonacii {
	static void fibon(int n) {
		int a = 0;
		int b = 1;
		int c = a + b;

		System.out.print(a + " " + b + " ");
		for (int i = 0; i < n - 2; i++) {
			System.out.print(c + " ");
			a = b;
			b = c;
			c = a + b;
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a  number up to you wants numbers");
		int b = scan.nextInt();
		fibon(b);
		scan.close();
	}
}
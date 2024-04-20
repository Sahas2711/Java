import java.util.scanner;

public class Binary_Search {
	public static void main(String[] args) {
		scanner sc = new scanner(System.in);

		int[] a = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.println("Enter the " + i + 1 + "element");
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the element you want to find ");
		int key = sc.nextInt();
		int start = 0;
		int end = 10;
		int mid = (start + end) / 2;
		for (int i = 0; i < mid; i++) {
			if (a[mid] == key) {
				System.out.println("The element  " + key + "  is found at " + mid);
			} else if (a[mid] > key) {
				end = mid - 1;
				mid = (start + end) / 2;
			} else {
				start = mid + 1;
				mid = (start + end) / 2;
			}
		}

	}
}

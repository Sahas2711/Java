import java.util.ArrayList;
import java.util.Scanner;

public class Primenumberlist {
    public static boolean isprime(int n) {
        boolean b = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                b = false;
                break;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 2; i < num; i++) {
            if (isprime(i)) {
                list.add(i);
            }
        }
        System.out.println(list);
        scanner.close();
    }
}

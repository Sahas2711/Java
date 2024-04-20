import java.util.Scanner;

public class factorial {

    public static int fact(int n) {
        int a = n;
        int fa = 1;
        if (n == 0) {
            System.out.println(1);

        } else {
            fa = n * fact(n - 1);
        }
        return fa;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int b = sc.nextInt();
        int c = fact(b);
        System.out.println(c);
        sc.close();
    }
}
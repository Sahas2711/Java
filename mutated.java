import java.util.Scanner;

public class mutated {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int count = 0;
            int array_length = scan.nextInt();
            int add = scan.nextInt();
            int[] genes = new int[array_length];
            for (int j : genes) {
                j = scan.nextInt();
            }
            for (int j = 0; j < genes.length; j++) {
                if ((genes[j] + add) % 7 == 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
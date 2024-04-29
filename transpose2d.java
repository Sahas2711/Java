import java.util.Scanner;

public class transpose2d {
    public static void Display(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] b = new int[4][4];
        // input
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b.length; j++) {
                b[i][j] = scan.nextInt();
            }
        }
        // logic
        for (int i = 0; i < b.length; i++) {
            for (int j = i + 1; j < i; j++) {
                int temp = b[i][j];
                b[i][j] = b[j][i];
                b[j][i] = temp;

            }
        }
        Display(b);
        scan.close();
    }

}

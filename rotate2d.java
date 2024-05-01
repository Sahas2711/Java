public class rotate2d {
    public static void Display(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void reverse(int[] array) {
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }

    public static void transpose(int[][] b) {
        for (int i = 0; i < b.length; i++) {
            for (int j = i + 1; j < i; j++) {
                int temp = b[i][j];
                b[i][j] = b[j][i];
                b[j][i] = temp;

            }
        }
    }

    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        transpose(a);
        for (int i = 0; i < a.length; i++) {
            reverse(a[i]);
        }
        Display(a);

    }
}

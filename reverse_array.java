import java.util.Scanner;

public class reverse_array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        ;
        int l = scan.nextInt();
        int[] array = new int[l];

        // input array
        for (int m = 0; m < l; m++) {
            System.out.println("Enter the elements of the array " + m);
            array[m] = scan.nextInt();
        }
        // Logic
        int i = 0;
        int j = l - 1;
        while (i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        // output
        for (int k : array) {
            System.out.print(k + " ");
        }
        scan.close();
    }
}

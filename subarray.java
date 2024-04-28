import java.util.Scanner;

public class subarray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input
        System.out.println("Enter the size of the array:");
        int size = scan.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }

        // Logic for counting subarrays
        int count = 0;
        for (int start = 0; start < size; start++) {
            for (int end = start; end < size; end++) {
                // Subarray print
                for (int j = start; j <= end; j++) {
                    System.out.print(array[j] + " ");
                }
                System.out.println(); // Move to the next line after printing each subarray
                count++;
            }
        }

        System.out.println("The array contains a total of " + count + " subarrays.");
        scan.close();
    }
}

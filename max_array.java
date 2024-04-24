import java.util.*;
import java.math.*;

public class max_array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Assigning maximum value to the smallest int

        int max = -32767;
        int index = 0;

        // Creation of array with Taking user input in array

        System.err.println("Enter the size of the array");
        int l = scan.nextInt();
        int[] arr1 = new int[l];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter the element " + i + 1 + " of arr1");
            arr1[i] = scan.nextInt();
        }

        // logic
        for (int i = 0; i < l; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
                index = i;
            }
        }

        // Display of maximum element

        System.out.print("In the array " + max + " is the maximum element with index " + index);

        scan.close();

    }
}

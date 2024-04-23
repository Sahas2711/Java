import java.util.*;

public class Array {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Creation of array

        int[] arr1 = new int[5];
        int[] arr2 = { 1, 2, 3, 4, 5, 6 };

        // Taking user input in array
        // for loop
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter the element " + i + 1 + " of arr1");
            arr1[i] = scan.nextInt();
        }
        // for each loop
        for (int k : arr2) {
            System.out.println("Enter the element " + k + 1 + " of arr2");
            arr2[k] = scan.nextInt();
        }

        // Display of array
        for (int j = 0; j < arr2.length; j++) {
            System.out.print(arr2[j] + "  ");
        }
        scan.close();
    }
}
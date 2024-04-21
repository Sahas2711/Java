import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number for the table");
        int number = scan.nextInt();
        for (int i = 0; i < 11; i++) {
            System.out.println(number + " X " + i + " " + number * i);
        }
        scan.close();
    }
}

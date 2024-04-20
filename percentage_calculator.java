import java.util.Scanner;

public class percentage_calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] marks = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the marks of  " + (i + 1) + " Subject");
            marks[i] = scan.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(marks[i]);
        }
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + marks[i];
        }
        System.out.println(sum);
        System.out.println("Your total marks in 5 Subjects :" + sum);
        System.out.println("Your total percentage in 5 Subjects :" + sum / 5 + "%");
    }
}
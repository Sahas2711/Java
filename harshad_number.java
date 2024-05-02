
// An integer divisible by the sum of its digits is said
//  to be a Harshad number. You are given an integer x. Return the sum 
//  of the digits of x if x is a Harshad number, otherwise, return -1.
import java.util.Scanner;

public class harshad_number {

    public static int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int num = -1;
        int o = x;
        while (x > 0) {
            int rem = x % 10;
            sum = sum + rem;
            x = x / 10;
        }
        if (o % sum == 0)
            return sum;
        else
            return num;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scan.nextInt();
        int result = sumOfTheDigitsOfHarshadNumber(num);
        if (result == -1) {
            System.out.println(num + " is not a harshad number");
        } else {
            System.out.println(num + " is a harshad number with a " + result + " digit sum");
        }
        scan.close();
    }
}
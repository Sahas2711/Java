import java.util.Scanner;
import java.util.Random;

public class Guess_the_number {
    static class Game {
        Scanner sc = new Scanner(System.in);
        private int random;

        public Game(int n) {
            random = n;
        }

        public void guessNumber(int a) {
            int count = 0;
            do {
                if (a == random) {
                    System.out.println("Congratulations! You guessed it right.");
                } else if (a > random) {
                    System.out.println("Please Think about a smaller number and enter:");
                    a = sc.nextInt();
                } else {
                    System.out.println("Please Enter a bigger number:");
                    a = sc.nextInt();
                }
                count++;
            } while (a != random);

            System.out.println("You guessed the number in " + count + " attempts.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1; // Generates a random number between 1 and 100
        Game game = new Game(randomNumber);

        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("Enter any number between 1 to 100:");

        int userGuess = sc.nextInt();
        game.guessNumber(userGuess);

        sc.close();

    }
}

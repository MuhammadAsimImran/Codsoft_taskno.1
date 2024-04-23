import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        int numRounds = 0;

        while (true) {
            int min = 1;
            int max = 100;
            int number = random.nextInt(max - min + 1) + min;
            int attempts = 0;
            int guess;
            System.out.println("Welcome to the guessing game! You have 10 attempts to guess the number between " + min + " and " + max + ".");

            while (attempts < 10) {
                attempts++;
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();

                if (guess < number) {
                    System.out.println("Too low! Try again.");
                } 
                else if (guess > number) {
                    System.out.println("Too high! Try again.");
                } 
                else                {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    score += attempts;
                    numRounds++;
                    break;
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next();

            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }

        double averageScore = (double) score / numRounds;
        System.out.println("Your score is " + score + " with an average of " + averageScore + " attempts per round.");
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
import java.util.Scanner;
import java.util.Random;
/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        // Generate the numbers
        int randomNumber = 1 + (int) (50 * Math.random());

        // Number of guesses
        int numberOfGuesses = 5;
        int k = 0;

        System.out.println("Enter number of guesses (1-50)");

        int userGuess = scanner.nextInt();

        if (userGuess == randomNumber) {
            System.out.println("Correct Guess");
        } else if (randomNumber > userGuess) {
            System.out.println("Too Large!");
        }
    } else

    {
        System.out.println("Too Small!");
    }
}
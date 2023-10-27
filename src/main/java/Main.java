import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int randomNumber = rand.nextInt(50) +1;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number between 1 and 50");
            int userGuess = scanner.nextInt();

            if (userGuess == randomNumber) {
                System.out.println("Congratulations you  guessed the right number!");
                break;
            }
            else if (randomNumber > userGuess) {
                System.out.println("Incorrect number. Try a larger number");
            }
            else {
                System.out.println("Try a smaller number");
            }

        }
        }

        }
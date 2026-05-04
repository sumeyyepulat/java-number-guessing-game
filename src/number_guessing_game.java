import java.util.Random;
import java.util.Scanner;

public class number_guessing_game {

    //INPUT VALIDATION FUNCTION (for crash control)
    static int getValidInt(Scanner input) {
        while (!input.hasNextInt()) {
            System.out.println("Invalid input! Please enter a number:");
            input.next();
            //clear  erroneous entry
        }
        return input.nextInt();
    }

    // PLAY GAME FUNCTION
    static void playGame(Scanner input) {
        Random random = new Random();

        System.out.println("\n----- Number Guessing Game -----");

        // RANGE INPUT
        System.out.println("Enter two numbers for range:");
        int num1 = getValidInt(input);
        int num2 = getValidInt(input);

        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);

        if (min == max) {
            System.out.println("Invalid range!");
            return;
        }

        int  random_number = random.nextInt(min,max+1);
        //first number is inclusive the second number is exclusive

        // ATTEMPT MODE
        System.out.println("Enter max attempts (0 = unlimited):");
        int max_attempts = getValidInt(input);

        int attempts = 0;
        //amount of attempts for correct number
        int guess;
        //hold our guess

        System.out.println("Guess a number between " + min + " and " + max);

        // GAME LOOP
        while (max_attempts == 0 || attempts < max_attempts) {

            //  ATTEMPT INFO
            if (max_attempts == 0) {
                System.out.println("Attempts: " + attempts);
            } else {
                int remaining = max_attempts - attempts;
                System.out.println("Attempts: " + attempts + " | Remaining: " + remaining);
            }

            System.out.println("Enter your guess:");
            guess = getValidInt(input);

            // OUT OF RANGE
            if (guess < min || guess > max) {
                System.out.println("Out of range!");
                continue;
            }

            attempts++;

            if (guess < random_number) {
                System.out.println("LOW! Try HIGHER number!");
            } else if (guess > random_number) {
                System.out.println("HIGH! Try LOWER number!");
            } else {
                System.out.println("CORRECT! The number was " + random_number);
                System.out.println("Attempts used: " + attempts);
                return;
            }
        }

        System.out.println("You lost! The number was " + random_number);
    }


    // MAIN + REPLAY SYSTEM
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        //user input


        while (true) {
            playGame(input);

            System.out.println("\nPlay again? (y/n):");
            String answer = input.next().toLowerCase();

            if (!answer.equals("y")) {
                System.out.println("Thanks for playing!");
                break;
            }
        }

        input.close();

    }
}


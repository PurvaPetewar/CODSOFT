import java.util.*;
import java.util.Random;

public class NumberGame {

    private static final int MAX_ATTEMPTS = 6; // Maximum number of attempts per round

    public static void main(String[] args) {
        Random random = new Random();
        int totalRounds = 0;
        int totalWins = 0;

        int argIndex = 0;

        while (argIndex < args.length) {
            totalRounds++;
            int targetNumber = random.nextInt(100) + 1;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("Round " + totalRounds + ": Guess the number between 1 and 100.");

            while (attempts < MAX_ATTEMPTS) {
                if (argIndex >= args.length) {
                    System.out.println("Not enough arguments for this round. Ending.");
                    return;
                }

                int userGuess;
                try {
                    userGuess = Integer.parseInt(args[argIndex++]);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter an integer.");
                    continue;
                }

                attempts++;

                if (userGuess < targetNumber) {
                    System.out.println("Attempt " + attempts + ": Too low!");
                } else if (userGuess > targetNumber) {
                    System.out.println("Attempt " + attempts + ": Too high!");
                } else {
                    System.out.println("Congratulations! You guessed the number.");
                    guessedCorrectly = true;
                    break;
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all your attempts. The number was: " + targetNumber);
            } else {
                totalWins++;
            }

            System.out.println("Round summary: Attempts made: " + attempts);
            System.out.println("Total rounds played: " + totalRounds);
            System.out.println("Total wins: " + totalWins);

            if (argIndex >= args.length) {
                break;
            }

            System.out.print("Do you want to play another round? (yes/no): ");
            if (argIndex < args.length && args[argIndex].equalsIgnoreCase("no")) {
                break;
            } else if (argIndex < args.length && !args[argIndex++].equalsIgnoreCase("yes")) {
                System.out.println("Invalid input for round continuation.");
                break;
            }
        }

        System.out.println("Final score: Rounds played: " + totalRounds + ", Wins: " + totalWins);
    }
}

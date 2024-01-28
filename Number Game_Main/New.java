import java.util.*;

//Not Working

public class New {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;

        int score = 0;

        boolean playAgain = true;
        while (playAgain) {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println("Welcome to the Number Guessing Game! ");
            System.out.println(
                    "I have selected a number between " + minRange + " and " + maxRange + " Try to guess the number: ");
            int attempts = 0;
            int maxAttempt = 10;
            while (attempts > maxAttempt) {
                System.out.print("Enter your guess number: ");
                int userGuess = sc.nextInt();
                attempts++;

                if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > targetNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number " + targetNumber + "in" + attempts);
                    score += maxAttempt - attempts + 1;
                    break;
                }
            }

            if (attempts == maxAttempt) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number");
            }

            System.out.println("Do you want to play again? (yes/no):");
            String playAgainResponse = sc.next().toLowerCase();
            playAgain = playAgainResponse.equals("yes");
        }
        System.out.println("Thanks for playing! Your score is: " + score);
    }
}
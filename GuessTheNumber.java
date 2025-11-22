import java.util.*;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int totalScore = 0;
        System.out.println("Welcome to GuessTheNumber Game!");
        boolean playAgain = true;
        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0;          
            int maxAttempts = 10;     
            boolean guessed = false;   
            System.out.println("\nI'm thinking of a number between 1 and 100.");
            System.out.println("You have " + maxAttempts + " attempts to guess it.");
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                attempts++;
                if (userGuess == numberToGuess) {
                    System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
                    int points = (maxAttempts - attempts + 1) * 10;
                    totalScore += points;
                    System.out.println("You earned " + points + " points this round!");
                    guessed = true;
                    break;
                } 
                else if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } 
                else {
                    System.out.println("Too high! Try again.");
                }
            }
            if (!guessed) {
                System.out.println(" You've used all attempts! The correct number was: " + numberToGuess);
            }
            System.out.println("Your total score : " + totalScore);
            System.out.print("\nDo you want to play another round? (yes/no): ");
            String choice = sc.next();
            playAgain = choice.equalsIgnoreCase("yes");
        }
        System.out.println("\n Game Over! Your final score: " + totalScore);
        sc.close();
    }
}

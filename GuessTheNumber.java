import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        
        int maxAttempts = 10;
        int attempts = 0;
        int score = maxAttempts;
        
        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println("I have selected a random number between " + lowerBound + " and " + upperBound + ".");
        System.out.println("Try to guess it in " + maxAttempts + " attempts or fewer.");
        
        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;
            
            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You've guessed the number: " + randomNumber);
                System.out.println("Attempts used: " + attempts);
                score = maxAttempts - attempts;
                System.out.println("Your score: " + score);
                break;
            } else if (userGuess < randomNumber) {
                System.out.println("Try a higher number.");
            } else {
                System.out.println("Try a lower number.");
            }
        }
        
        if (attempts >= maxAttempts) {
            System.out.println("Sorry, you've reached the maximum number of attempts.");
            System.out.println("The correct number was: " + randomNumber);
            System.out.println("Your score: 0");
        }
        
        scanner.close();
    }
}

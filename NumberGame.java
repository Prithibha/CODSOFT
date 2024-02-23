import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int Minimum = 1;//lower bound of the range
        int Maximum = 100;//upper bound of the range
        int Attempts = 10;//maximum no of attempts
        int Score = 0;//initial score
        String smiley = "\uD83D\uDE00";//emoji
        String thumbsUp = "\uD83D\uDC4D";
        String heart = "\u2764\uFE0F";
        System.out.println("*********************************************************");
        System.out.println("                  NUMBER GUESSING GAME!                  ");
        System.out.println("*********************************************************");
        System.out.println("Maximum number of attempts= "+Attempts);
        do {
            int randomNumber = random.nextInt(Maximum - Minimum + 1)/*[0,100)*/ + Minimum;//generates a random integer within the range [Minimum, Maximum].
            int attempts = 0;
            System.out.println("\nGuess the number between " + Minimum + " and " + Maximum);
            while (attempts < Attempts) //(attempts<maximum)&&correct
            {
                System.out.print("Enter your guess: ");
                int UserGuess = scanner.nextInt();
                if (UserGuess < Minimum || UserGuess > Maximum) {
                    System.out.println("Please guess a number within the given range!");
                    continue;
                }
                attempts++;
                if (UserGuess == randomNumber) {
                    System.out.println("Congratulations!"+heart+" You guessed the correct number in " + attempts + " attempts.");
                    Score = attempts;
                    System.out.println("your score is "+(100-(Score*10)));

                    System.out.println("Thanks for playing!!"+smiley);
                    break;
                } else if (UserGuess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }
            if (attempts == Attempts) {
                System.out.println("Sorry, you've reached the maximum number of attempts");
                System.out.println("Try again!"+thumbsUp);
            }
            System.out.print("Do you want to play again? (yes/no): ");
        } while (scanner.next().equalsIgnoreCase("yes"));
    }
}











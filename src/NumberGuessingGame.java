import java.security.SecureRandom;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args)
    {
        //Objects used for reading from the keyboard and creating random numbers
        Scanner keyboard = new Scanner(System.in);
        SecureRandom rng = new SecureRandom();

        int userGuessCount = 0;

        int compNum = rng.nextInt(10)+1; //converts random number from 0-9 into 1-10
        int userGuess = 0;               //initial value outside the range 1-10

        do{
            System.out.printf("Enter your guess (1-10): ");
            userGuess = getValidInput();  //create a method to ensure a # 1-10 is returned
            userGuessCount++;

            if (userGuess < compNum)
                System.out.printf("higher%n");
            else if (userGuess > compNum)
                System.out.printf("lower%n");

        } while (userGuess != compNum);

        System.out.printf("You guessed the number in %d guesses", userGuessCount);
    }

}

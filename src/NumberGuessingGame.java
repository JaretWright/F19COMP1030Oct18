import java.security.SecureRandom;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args)
    {
        //Objects used for reading from the keyboard and creating random numbers
        SecureRandom rng = new SecureRandom();

        int userGuessCount = 0;

        int compNum = rng.nextInt(10)+1; //converts random number from 0-9 into 1-10
        int userGuess = 0;               //initial value outside the range 1-10

        do{
            userGuess = getValidInput();  //create a method to ensure a # 1-10 is returned
            userGuessCount++;

            if (userGuess < compNum)
                System.out.printf("higher%n");
            else if (userGuess > compNum)
                System.out.printf("lower%n");

        } while (userGuess != compNum);

        System.out.printf("You guessed the number in %d guesses", userGuessCount);
    }

    /**
     * This method will ask the user to enter a number 1-10.  It will
     * keep asking for a valid number until one is entered
     */
    public static int getValidInput()
    {
        Scanner keyboard = new Scanner(System.in);
        int userGuess =0;

        while (userGuess < 1 || userGuess > 10)
        {
            System.out.printf("You must enter a number between 1 and 10: ");
            try {
                userGuess = keyboard.nextInt();
            }
            catch (Exception e)
            {
                System.out.printf("Only integers 1-10 are valid!");
                keyboard.nextLine();  //clear the buffer
                userGuess = 0;
            }
        }
        return userGuess;
    }

}

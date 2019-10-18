import java.security.SecureRandom;

public class Craps {

    /**
     * enums will be used to store the status of the game
     * @param args
     */
    private enum Status {CONTINUE, WON, LOST};

    //define constants to sound like a Vegas Kingpin
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args)
    {
        int sumOfDice = rollTwoDice();
    }

    /**
     * This method will simulate rolling 2 dice and return their sum
     */
    public static int rollTwoDice()
    {
        SecureRandom rng = new SecureRandom();

        int die1 = rng.nextInt(6)+1;
        int die2 = rng.nextInt(6)+1;

        System.out.printf("Die 1: %d        Die 2: %d %n", die1, die2);

        return die1+die2;
    }
}

import java.util.Random;
import java.util.Scanner;

/**
 * @version 2016-08-30
 * @author Michael Servilla
 */
public class GuessNumber {

    /**
     * Guessing random numbers.
     * @param args Command-Line arguments are ignored.
     */
    public static void main(String [] args){
//        Random rand = new Random();
//        int randomNumber = rand.nextInt(10) + 1;

        int rand = (int) (Math.random()*10)+1;
        Scanner scanIn = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String userName = scanIn.next();
        System.out.print("Hi there " + userName +", please pick a random number between 1 and 10: ");
        int number = scanIn.nextInt();
        System.out.println("You picked " + number + "!");
        System.out.println("My number was " + rand + "!");
        if (rand == number){
            System.out.println("Congratulations, you picked the correct number!");
        }
        else System.out.println("Sorry, you were wrong.");
    }
}

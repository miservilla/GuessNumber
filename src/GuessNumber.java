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
        int rand = (int) (Math.random()*10)+1;
        Scanner scanIn = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String userName = scanIn.next();
        System.out.print("Hi there " + userName +", please pick a random number between 1 and 10: ");
        int number = TryParseIn();
        System.out.println("You picked " + number + "!");
        System.out.println("My number was " + rand + "!");
        if (rand == number){
            System.out.println("Congratulations, you picked the correct number!");
        }
        else System.out.println("Sorry, you were wrong.");
    }

//Method for error control.
    private static int TryParseIn(){
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            while (!sc.hasNextInt()){
                System.out.printf("Can not parse, please pick a random number between 1 and 10: ");
                sc.next();
            }
            number = sc.nextInt();
            if ((number < 1) || (number > 10)){
                System.out.printf("Can not parse, please pick a random number between 1 and 10: ");
            }
        } while (number < 1 || number > 10);

        return number;
    }
}

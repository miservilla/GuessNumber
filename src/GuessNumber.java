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
        String stay = "Y";
        Scanner scanIn = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String userName = scanIn.next();

        //While loop to continue to play (stay or quit).
        while (stay.equalsIgnoreCase("Y")) {
            System.out.print("Hi there " + userName + ", please pick a number between 1 and 10 (inclusive): ");
            int rand = (int) (Math.random() * 10) + 1;
            int number = TryParseIn();
            System.out.println("You picked " + number + "!");
            System.out.println("My number was " + rand + "!");
            if (rand == number) {
                System.out.println("Congratulations, you picked the correct number!");
            } else {
                System.out.println("Sorry, you were wrong.");
            }
            System.out.print("Type 'Y' to play again, type any other letter to quit: ");
            stay = scanIn.next();
        }
    }

    //Method for input error control.
    private static int TryParseIn(){
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            while (!sc.hasNextInt()){
                System.out.printf("Not a number between 1 and 10 (inclusive), try again: ");
                sc.next();
            }
            number = sc.nextInt();
            if ((number < 1) || (number > 10)){
                System.out.printf("Not a number between 1 and 10 (inclusive), try again: ");
            }
        } while (number < 1 || number > 10);

        return number;
    }
}

import java.util.Scanner;
import java.util.Random;

public class GuessRandom {
    public static void main(String[] main) {
        Random rand = new Random();
        int randomNum = rand.nextInt(101);

        Scanner console = new Scanner(System.in);
        int choice;
        System.out.print("Input a an Integer: ");
        choice = console.nextInt();
        while (choice != randomNum) {
            if (choice > randomNum) {
                System.out.print("Too high, try again: ");
                choice = console.nextInt();
            } else if (choice < randomNum) {
                System.out.print("Too low, try again: ");
                choice = console.nextInt();
            }
        }
        console.close();
        System.out.printf("Correct! The answer was %d", randomNum);
    }
}
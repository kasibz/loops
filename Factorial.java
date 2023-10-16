import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int choice;
        do {
            System.out.print("Input a positive Integer: ");
            choice = console.nextInt();
        } while (choice < -1 && choice > 9);
        int factorial = choice;

        // count backwards from factorial but skip the original number
        // 0! and 1! are edge cases so skip them.
        if (choice > 1) {
            for (int i = factorial - 1; i > 0; i--) {
                factorial *= i;
            }
            System.out.printf("%d! = %d", choice, factorial);
        } else {
            System.out.printf("%d! = 1", choice);
        }

    }
}
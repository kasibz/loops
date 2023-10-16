import java.util.Scanner;

public class PrimeInput {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int choice;
        do {
            System.out.print("Input a positive Integer: ");
            choice = console.nextInt();
        } while (choice < -1);

        // check if the choice is prime.
        boolean flag = true;
        if (choice < 2)
            flag = false;

        else if (choice == 2)
            flag = true;

        else {
            // iterate from 2 to the root floor + 1
            double rootDouble = Math.sqrt(choice);
            long rootInt = Math.round(rootDouble);

            for (int i = 2; i < rootInt + 1; i++) {
                if (choice % i == 0)
                    flag = false;
            }
        }
        console.close();
        if (flag)
            System.out.printf("%d is a prime number", choice);
        else
            System.out.printf("%d is not a prime number", choice);

    }
}
import java.util.Scanner;

public class AskSum {
    public static void main(String[] main) {
        Scanner console = new Scanner(System.in);
        int num1;
        int num2;
        char choice;
        do {
            System.out.print("Input the first number: ");
            num1 = console.nextInt();

            System.out.print("Input the second number: ");
            num2 = console.nextInt();
            int sum = num1 + num2;
            System.out.printf("The sum is %d.\nWould you like to try again (Y/N)? ", sum);

            choice = console.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        console.close();
    }
}
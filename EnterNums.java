import java.util.Scanner;
import java.util.ArrayList;

public class EnterNums {
    public static void main(String[] main) {
        Scanner console = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        // store entries in a list then do my operations for pos, neg, and zeroes
        char choice;
        do {
            System.out.print("Input an integer: ");
            int numEntered = console.nextInt();
            numList.add(numEntered);
            System.out.printf("%d stored\nWould you like to enter another number (Y/N)? ", numEntered);

            choice = console.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');
        console.close();
        // iterate through list return the counts
        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;

        for (int num : numList) {
            if (num > 0)
                posCount++;
            else if (num < 0)
                negCount++;
            else
                zeroCount++;
        }

        System.out.printf("\nQuantity of Numbers Entered\n*-*-*-*-*-*-*-*\nPositive: %d\nNegative: %d\nZeroes: %d",
                posCount, negCount, zeroCount);
    }
}
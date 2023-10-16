import java.util.Scanner;
import java.util.ArrayList;

public class LargestSmallest {
    public static void main(String[] main) {
        Scanner console = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        // store entries in a list then do my operations for largest and smallest
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
        int smallest = numList.get(0);
        int largest = numList.get(0);

        for (int num : numList) {
            if (num > largest)
                largest = num;
            else if (num < smallest)
                smallest = num;
        }
        System.out.printf("Largest number is %d.\nSmallest number is %d", largest, smallest);

    }
}
import java.util.Scanner;

public class SumOfSeries {

    public static void main(String[] args) {

        // get user input
        Scanner console = new Scanner(System.in);
        int userNum;
        do {
            System.out.print("Input a positive integer: ");
            userNum = console.nextInt();
        } while (userNum < 1);
        // store the sequence in List, skip the first two
        double sum = 0.0;
        for (int i = 1; i <= userNum; i++) {
            sum += 1.0 / i;
        }
        console.close();
        System.out.printf("The harmonic sum is %.2f", sum);
    }
}
import java.util.Scanner;

public class NaturalLog {

    public static void main(String[] args) {

        // get user input
        Scanner console = new Scanner(System.in);
        int userNum;
        do {
            System.out.print("Input a positive integer: ");
            userNum = console.nextInt();
        } while (userNum < 1);
        console.close();
        // store the sequence in List, skip the first two
        double sum = 0.0;
        for (int i = 1; i <= userNum; i++) {
            // at pos 1, I'm subtracting 1/2 from 1
            if (i % 2 == 0) {
                sum -= 1.0 / i;
            } else {
                sum += 1.0 / i;
            }
        }
        System.out.printf("The harmonic sum is %.2f", sum);
    }
}
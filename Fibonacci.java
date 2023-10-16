import java.util.Scanner;
import java.util.ArrayList;

public class Fibonacci {

    public static void main(String[] args) {

        // get user input
        Scanner console = new Scanner(System.in);
        int userNum;
        do {
            System.out.print("Input a non negative integer: ");
            userNum = console.nextInt();
        } while (userNum < -1);

        // store the sequence in List, skip the first two
        ArrayList<Integer> seq = new ArrayList<>();
        seq.add(0);
        seq.add(1);
        if (userNum > 1) {
            for (int i = 2; i <= userNum; i++) {
                int nextNum = seq.get(i - 2) + seq.get(i - 1);
                seq.add(nextNum);
            }
        }
        console.close();
        if (userNum == 0) {
            seq.remove(1);
        }
        for (int num : seq) {
            System.out.print(num + " ");
        }
    }
}
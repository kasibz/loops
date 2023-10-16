import java.util.Scanner;

public class DigitReverse {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int userNum = console.nextInt();
        console.close();
        // to iterate, split into string array
        String[] strNumArr = String.valueOf(userNum).split("");

        // iterate backwards and print the number by digit.
        for (int i = strNumArr.length - 1; i >= 0; i--) {
            System.out.print(strNumArr[i]);
        }
    }
}
import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = console.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = console.nextInt();

        console.close();
        int largeNum = 0;
        int smallNum;
        int res;

        // if the numbers are the same then HCF is just that number
        if (num1 == num2) {
            res = num1;

        } else {

            // ordering the numbers by their size. HCF calculated by division.
            if (num1 > num2) {
                largeNum = num1;
                smallNum = num2;
            } else {
                largeNum = num2;
                smallNum = num1;
            }
            int remainder = largeNum;

            // Contiually divide the denominator by the remainder until their is no
            // remainder. The last denominator is the answer.
            while (remainder != 0) {
                remainder = largeNum % smallNum;
                largeNum = smallNum;
                smallNum = remainder;
            }
            res = largeNum;

        }
        System.out.printf("The HCF of %d and %d is %d", num1, num2, res);
    }
}
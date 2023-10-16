import java.util.Scanner;

public class PowerOfAnother {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = console.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = console.nextInt();
        int initialNum = num1;

        if (num2 == 0) {
            num1 = 1;
        } else {
            for (int i = 0; i < num2 - 1; i++) {
                num1 *= initialNum;
            }
        }
        console.close();
        System.out.printf("%d raised to the power of %d is %d", initialNum, num2, num1);
    }
}
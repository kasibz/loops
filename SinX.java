import java.util.Scanner;

public class SinX {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int choice;
        do {
            System.out.print("Input a positive Integer: ");
            choice = console.nextInt();
        } while (choice < 0);
        System.out.print("Supply an integer for x: ");
        int x = console.nextInt();

        console.close();

        // 1 = x, 3 = x^3/3! 5 =
        double sinResult = 0.0;
        boolean isAddition = true;
        for (int i = 1; i < choice * 2; i += 2) {
            if (i == 1) {
                sinResult += x;
                isAddition = false;
            } else if (!isAddition) {
                sinResult -= Math.pow(x, i) / SinX.factorial(i);
                isAddition = true;
            } else if (isAddition) {
                sinResult += Math.pow(x, i) / SinX.factorial(i);
                isAddition = false;
            }

        }
        System.out.print(sinResult);
    }

    public static int factorial(int num) {
        if (num < 2)
            return 1;
        else {
            return num * factorial(num - 1);
        }
    }
}
import java.util.Scanner;

public class Cosine {
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
        double cosineResult = 0.0;
        boolean isAddition = true;
        for (int i = 0; i < choice * 2; i += 2) {
            if (i == 1) {
                cosineResult += 1;
                isAddition = false;
            } else if (!isAddition) {
                cosineResult -= Math.pow(x, i) / Cosine.factorial(i);
                isAddition = true;
            } else if (isAddition) {
                cosineResult += Math.pow(x, i) / Cosine.factorial(i);
                isAddition = false;
            }

        }
        System.out.print(cosineResult);
    }

    public static int factorial(int num) {
        if (num < 2)
            return 1;
        else {
            return num * factorial(num - 1);
        }
    }
}
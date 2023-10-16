import java.util.Scanner;

public class MultTable {
    public static void main(String[] main) {
        Scanner console = new Scanner(System.in);
        int choice;
        do {
            System.out.print("Input a positive Integer: ");
            choice = console.nextInt();
        } while (choice < 0);
        console.close();
        // print multiplication table. I'm going for the grid view
        for (int i = 0; i <= choice; i++) {
            for (int j = 0; j <= choice; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
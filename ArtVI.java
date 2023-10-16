public class ArtVI {
    public static void main(String[] args) {
        // asterisks:1, 3, 5, 7, 9
        // make the spaces before the asterisk and then make new line
        int len = 5;
        // instead of int, use a structure?
        int count = 1;
        for (int i = 0; i < len; i++) {

            // spaces come first and their loop ends
            // spaces = 4, 3, 2, 1, 0
            for (int j = 0; j < len - i - 1; j++) {
                System.out.print(" ");
            }

            // next come the asterisks which grow
            // 1, 3, 5, 7, 9
            for (int k = 0; k < 2 * i + 1; k++) {
                if (k == i)
                    System.out.print(1);
                else if (i == k - 1 || i == k + 1)
                    System.out.print(2);
                else if (i == k - 2 || i == k + 2)
                    System.out.print(3);
                else if (i == k - 3 || i == k + 3)
                    System.out.print(4);
                else
                    System.out.print(count);
            }
            System.out.println();
            count++;
        }
    }
}
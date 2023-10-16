public class ArtIV {
    public static void main(String[] args) {
        // spaces: 8 / 2, 6 / 2, 4 /2, 2, 0
        // asterisks:1, 3, 5, 7, 9
        // make the spaces before the asterisk and then make new line
        int len = 5;

        for (int i = 0; i < len; i++) {
            // spaces come first and their loop ends
            // spaces = 4, 3, 2, 1, 0
            for (int j = 0; j < len - i - 1; j++) {
                System.out.print(" ");
            }
            // next come the asterisks which grow
            // 1, 3, 5, 7, 9
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
public class ArtIII {
    public static void main(String[] args) {
        int len = 5;
        // Iterate normal on outer loop
        for (int i = 0; i < len; i++) {

            // spaces come first and iterate to decrease spaces as i gets larger
            for (int j = 0; j <= len - i; j++) {
                System.out.print(" ");
            }
            // next come the asterisks which increase with i.
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
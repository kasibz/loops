
public class ArmstrongNum {
    public static void main(String[] args) {
        // armstrong number is cube each digit
        // get the sum and then check against original num
        // if they are the same, Armstrong Num!
        for (int i = 1; i <= 500; i++) {

            // convert to string for iteration
            // i is still the original number make variable for the sum
            int sum = 0;
            String[] numStr = String.valueOf(i).split("");
            for (String num : numStr) {
                int strToNum = Integer.parseInt(num);
                // cube it!
                double cubed = Math.pow(strToNum, 3);
                sum += cubed;
            }
            if (sum == i)
                System.out.print(i + " ");
        }
    }
}
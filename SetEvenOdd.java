
public class SetEvenOdd {
    public static void main(String[] args) {

        int[] intArr = new int[] { 5, 10, 15, 7, 9, 12, 54, 19, 21, 25, 30, 31, 98, 99, 101 };
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] % 2 == 0)
                evenSum += intArr[i];
            else
                oddSum += intArr[i];
        }
        System.out.printf("Even sum = %d\nOdd sum = %d", evenSum, oddSum);
    }
}
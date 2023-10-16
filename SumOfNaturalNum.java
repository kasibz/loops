// natural numbers start from 1 so first 10 would go to 11

public class SumOfNaturalNum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 11; i++) {
            sum += i;
        }
        System.out.print(sum);
    }
}
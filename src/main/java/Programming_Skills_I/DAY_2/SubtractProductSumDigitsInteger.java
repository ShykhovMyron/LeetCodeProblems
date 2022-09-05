package Programming_Skills_I.DAY_2;

public class SubtractProductSumDigitsInteger {
    public int subtractProductAndSum(int n) {
        int digits = 1;
        int sum = 0;
        while (n != 0) {
            digits *= n % 10;
            sum += n % 10;
            n /= 10;
        }

        return digits - sum;
    }
}

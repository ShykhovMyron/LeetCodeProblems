package Programming_Skills_I.DAY_6;

public class SumAllOddLengthSubarrays {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int length = 1;
        do {
            int firstInd = 0;
            int secondInd = firstInd + length;
            while (secondInd <= arr.length) {
                for (int i = firstInd; i < secondInd; i++) {
                    sum += arr[i];
                }
                firstInd++;
                secondInd++;
            }
            length += 2;
        } while (length <= arr.length);

        return sum;
    }
}

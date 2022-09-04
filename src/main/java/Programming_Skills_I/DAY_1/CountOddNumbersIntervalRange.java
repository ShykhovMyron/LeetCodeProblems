package Programming_Skills_I.DAY_1;

public class CountOddNumbersIntervalRange {
    public int countOdds(int low, int high) {
        int count = 0;
        if (low % 2 != 0 && high % 2 != 0) {
            count = (high - low) / 2 + 1;
        } else count = (int) Math.ceil((double) (high - low) / 2);
        return count;
    }
}

package Programming_Skills_I.DAY_4;

import java.util.Arrays;

public class CanMakeArithmeticProgressionFromSequence {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[0] - arr[1];
        for (int i = 2; i < arr.length; i++) {
            if (diff != arr[i - 1] - arr[i]) return false;
        }
        return true;
    }
}

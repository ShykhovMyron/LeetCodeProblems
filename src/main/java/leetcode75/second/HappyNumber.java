package leetcode75.second;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {
    private final static List<Integer> usedInts = new ArrayList<>();

    public boolean isHappy(int n) {
        if (n == 1) return true;
        if (usedInts.contains(n)) return false;
        else usedInts.add(n);
        int curr = 0;
        for (char c : String.valueOf(n).toCharArray()) {
            curr += Character.getNumericValue(c) * Character.getNumericValue(c);
        }
        return isHappy(curr);
    }
}

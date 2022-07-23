package leetcode75.first;

import java.util.HashMap;

public class ClimbingStairs {
    HashMap<Integer, Integer> stairsSteps = new HashMap<>();

    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (stairsSteps.containsKey(n)) return stairsSteps.get(n);
        stairsSteps.put(n, climbStairs(n - 1) + climbStairs(n - 2));
        return stairsSteps.get(n);
    }
}

package leetcode75.first;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> diffs = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (diffs.containsKey(nums[i])) {
                return new int[]{i, diffs.get(nums[i])};
            }
            diffs.put(target - nums[i], i);
        }

        return new int[]{};
    }
}

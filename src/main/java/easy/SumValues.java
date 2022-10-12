package easy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumValues {
    public int getCountOfSums(List<Integer> nums, int k, int target) {
        if (nums == null || nums.isEmpty()) return 0;

        List<Integer> numsDistinct = nums.stream().distinct().toList();
        if (k > numsDistinct.size()) return 0;

        int[] indexes = new int[k];
        Set<Set<Integer>> visited = new HashSet<>();
        for (int i = 0; i < indexes.length; i++) indexes[i] = i;
        while (indexes[0] != nums.size() - 1) {
            while (indexes[k - 1] < nums.size()) {
                Set<Integer> current = new HashSet<>();
                for (int i = 0; i < k; i++) {
                    int curNum = nums.get(indexes[i]);
                    current.add(curNum);
                }
                indexes[k - 1]++;
                if (current.size() == k &&
                        !visited.contains(current) &&
                        getSum(current) == target) {
                    visited.add(current);
                }
            }
            incrementOurOfBound(indexes, nums.size());
        }
        return visited.size();
    }

    private int getSum(Set<Integer> current) {
        int sum = 0;
        for (Integer integer : current) sum += integer;
        return sum;
    }

    private void incrementOurOfBound(int[] indexes, int listSize) {
        for (int i = indexes.length - 1; i >= 0; i--) {
            if (indexes[i] == listSize) {
                indexes[i] = 0;
                if (i > 0) indexes[i - 1]++;
            }
        }
    }
}

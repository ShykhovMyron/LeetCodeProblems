import org.assertj.core.api.Assertions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.Collections.emptyList;

public class Number implements NumberInter {

    private final List<Integer> nums;

    public Number(List<Integer> nums) {
        if (nums == null) this.nums = Collections.synchronizedList(new ArrayList<>());
        else this.nums = Collections.synchronizedList(nums);
    }

    @Override
    public boolean addNumber(int n) {
        try {
            nums.add(n);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean findValue(int target) {
        try {
            return nums.contains(target);
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
        Set<Set<Integer>> result1 = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            for (int k = 0; k < list.size(); k++) {
                for (int j = 0; j < list.size(); j++) {
                    for (int t = 0; t < list.size(); t++) {
                        Set<Integer> list1 = new HashSet<>();
                        list1.add(list.get(i));
                        list1.add(list.get(j));
                        list1.add(list.get(k));
                        list1.add(list.get(t));
                        if (list1.size() == 4) result1.add(list1);
                    }
                }
            }
        }
        Set<Set<Integer>> result2 = new HashSet<>();
        int n = 4;
        int[] indexes = new int[n];
        for (int i = 0; i < indexes.length; i++) indexes[i] = i;
        while (indexes[0] != list.size() - 1) {
            while (indexes[n - 1] < list.size()) {
                Set<Integer> current = new HashSet<>();
                for (int i = 0; i < n; i++) {
                    int curNum = list.get(indexes[i]);
                    current.add(curNum);
                }
                indexes[n - 1]++;
                if (current.size() == n) result2.add(current);
            }
            new Number(emptyList()).incrementOurOfBound(indexes, list.size());
        }
        Assertions.assertThat(result1).hasSameElementsAs(result2);
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

package daily;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MajorityElementII {
  public List<Integer> majorityElement(int[] nums) {
    //    Arrays.sort(nums);
    List<Integer> list = new ArrayList<>();
    List<Integer> result = new ArrayList<>();
    for (int num : nums) list.add(num);
    Collections.sort(list);
    int maxCount = nums.length / 3;
    int current;
    int firstInd, lastInd = -1;
    while (lastInd != nums.length - 1) {
      current = list.get(lastInd + 1);
      firstInd = list.indexOf(current);
      lastInd = list.lastIndexOf(current);
      if ((1 + lastInd - firstInd) > maxCount) {
        result.add(current);
      }
    }

    return result;
  }
}

package daily._2022_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumbersWithSameConsecutiveDifferences {
  List<Integer> result = new ArrayList<>();
  int maxLen;
  int maxDiff;

  public int[] numsSameConsecDiff(int n, int k) {
    maxLen = 10 ^ (n - 1);
    maxDiff = k;
    int resultNum;
    for (int firstNum = 1; firstNum <= 9; firstNum++) {
      int current = firstNum;
      resultNum = current;
      findValue(current, resultNum);
    }
    Collections.sort(result);
    return result.stream().mapToInt(Integer::intValue).toArray();
  }

  private void findValue(int current, int resultNum) {
    int test = 189 / 100;
    if (resultNum / maxLen != 0) {
      if (!result.contains(resultNum)) result.add(resultNum);
      return;
    }
    int currentPos = getNextValPos(current);
    if (currentPos != -1) {
      findValue(currentPos, resultNum * 10 + currentPos);
    }
    int currentNeg = getNextValNeg(current);
    if (currentNeg != -1) {
      findValue(currentNeg, resultNum * 10 + currentNeg);
    }
  }

  private int getNextValPos(int current) {
    if (current + maxDiff < 10) return current + maxDiff;
    else return -1;
  }

  private int getNextValNeg(int current) {
    if (current - maxDiff >= 0) return current - maxDiff;
    else return -1;
  }
}

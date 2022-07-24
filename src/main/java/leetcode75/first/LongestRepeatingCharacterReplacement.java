package leetcode75.first;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        int maxCount = 0;
        int startIndex = 0;
        int endIndex;
        char[] chars = s.toCharArray();

        for (endIndex = 0; endIndex < chars.length; endIndex++) {
            map.compute(chars[endIndex], (key, val) -> val == null ? 1 : ++val);
            maxCount = Math.max(map.get(chars[endIndex]), maxCount);
            int otherChars = (endIndex - startIndex) - maxCount;
            if (otherChars <= k) {
                result = Math.max(result, maxCount + otherChars);
            } else {
                map.compute(chars[startIndex], ((key, val) -> --val));
                startIndex++;
                maxCount = 0;
            }
        }

        return result;
    }
}

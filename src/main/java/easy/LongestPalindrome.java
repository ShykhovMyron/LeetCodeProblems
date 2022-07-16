package easy;

import java.util.Map;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.compute(c, (k, v) -> v == null ? 1 : ++v);
        }

        boolean isOdd = false;
        int maxPali = 0;
        for (Integer value : charCount.values()) {
            if (value % 2 != 0) {
                if (!isOdd) isOdd = true;
                else maxPali--;
            }
            maxPali += value;
        }

        return maxPali;
    }
}

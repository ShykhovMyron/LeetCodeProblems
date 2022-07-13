package easy;

/**
 * 392. Is Subsequence
 * Easy
 * <p>
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * <p>
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "abc", t = "ahbgdc"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "axc", t = "ahbgdc"
 * Output: false
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 0 <= s.length <= 100
 * 0 <= t.length <= 104
 * s and t consist only of lowercase English letters.
 */
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int prevIndex = -1;
        for (char c : s.toCharArray()) {
            prevIndex = t.indexOf(c, prevIndex + 1);
            if (prevIndex == -1) return false;
        }
        return true;
    }
}

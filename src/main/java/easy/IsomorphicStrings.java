package easy;

import java.util.Arrays;

/**
 * 205. Isomorphic Strings
 * Easy
 * <p>
 * Given two strings s and t, determine if they are isomorphic.
 * <p>
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * <p>
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "egg", t = "add"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "foo", t = "bar"
 * Output: false
 * Example 3:
 * <p>
 * Input: s = "paper", t = "title"
 * Output: true
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 5 * 104
 * t.length == s.length
 * s and t consist of any valid ascii character.
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] firstS = new int[s.length()];
        int[] secondS = new int[t.length()];
        fillArray(s, firstS);
        fillArray(t, secondS);
        return Arrays.equals(firstS, secondS);
    }

    private void fillArray(String s, int[] array) {
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) { //is empty
                char currentChar = s.charAt(i);
                int currentIndex = i;
                while (currentIndex >= 0) {
                    array[i] = count;
                    currentIndex = s.indexOf(currentChar, currentIndex + 1);
                }
                count++;
            }
        }
    }
}

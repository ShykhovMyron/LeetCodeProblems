package leetcode75.first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        char[] chars = s.toCharArray();
        char[] goalChars = p.toCharArray();
        Arrays.sort(goalChars);
        for (int i = goalChars.length; i <= chars.length; i++) {
            char[] curWindow = Arrays.copyOfRange(chars, i - goalChars.length, i);
            Arrays.sort(curWindow);
            if (Arrays.equals(goalChars, curWindow)) {
                result.add(i - goalChars.length);
            }
        }

        return result;
    }
}

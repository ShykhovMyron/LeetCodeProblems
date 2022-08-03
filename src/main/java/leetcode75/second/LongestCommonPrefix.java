package leetcode75.second;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (result.equals("")) break;
            int index;
            for (index = 0; index < Math.min(strs[i].length(), result.length()); index++) {
                if (strs[i].charAt(index) != result.charAt(index)) {
                    break;
                }
            }
            result = result.substring(0, index);
        }
        return result;
    }
}

package Programming_Skills_I.DAY_9;

public class FindDifference {
    public char findTheDifference(String s, String t) {
        int[] chars = new int[256];
        int indexS = 0, indexT = 0;
        while (indexS != s.length() || indexT != t.length()) {
            if (indexS < s.length()) chars[s.charAt(indexS++)]--;
            if (indexT < t.length()) chars[t.charAt(indexT++)]++;
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != 0) return (char) i;
        }
        return 0;
    }
}

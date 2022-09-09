package Programming_Skills_I.DAY_8;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        int ind1 = 0, ind2 = 0;
        StringBuilder builder = new StringBuilder();
        while (ind1 != word1.length() && ind2 != word2.length()) {
            if (ind1 < word1.length()) builder.append(word1.charAt(ind1++));
            if (ind2 < word2.length()) builder.append(word2.charAt(ind2++));
        }

        return builder.toString();
    }
}

package Programming_Skills_I.DAY_9;

public class DecryptStringAlphabetMapping {
    public String freqAlphabets(String s) {
        StringBuilder result = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == '#') {
                int num = Character.getNumericValue(chars[--i]) + Character.getNumericValue(chars[--i]) * 10;
                result.insert(0, (char) ('a' + (num - 1)));
            } else {
                result.insert(0, (char) ('a' + (Character.getNumericValue(chars[i]) - 1)));
            }
        }

        return result.toString();
    }
}

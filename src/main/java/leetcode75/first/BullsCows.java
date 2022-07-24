package leetcode75.first;

public class BullsCows {
    private static final char firstChar = '0';

    public String getHint(String secret, String guess) {
        int[] ints = new int[10];
        int B = 0;
        int A = 0;
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) A++;
            else {
                if (ints[secret.charAt(i) - firstChar]++ < 0) B++;
                if (ints[guess.charAt(i) - firstChar]-- > 0) A++;
            }
        }

        return "%sA%sB".formatted(A, B);
    }
}

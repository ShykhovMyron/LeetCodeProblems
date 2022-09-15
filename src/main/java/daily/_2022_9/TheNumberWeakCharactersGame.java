package daily._2022_9;

import java.util.Arrays;
import java.util.Comparator;

public class TheNumberWeakCharactersGame {
    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties, Comparator
                .comparingInt((int[] s) -> s[0])
                .reversed()
                .thenComparingInt(s -> s[1]));
        int sum = 0, max = Integer.MIN_VALUE;
        for (int[] property : properties) {
            if (property[1] < max) sum++;
            else max = property[1];
        }
        return sum;
    }

    private boolean isMore(int[] current, int[] prev) {
        return (current[0] > prev[0] && current[1] > prev[1]);
    }
}

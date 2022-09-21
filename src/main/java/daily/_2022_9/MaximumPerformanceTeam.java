package daily._2022_9;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumPerformanceTeam {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int[][] engineers = new int[n][2];
        for (int i = 0; i < engineers.length; i++) {
            engineers[i] = new int[]{speed[i], efficiency[i]};
        }
        Arrays.sort(engineers, Comparator.comparing((int[] s) -> s[0] * s[1]).reversed());
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < k; i++) {
            sum += engineers[i][0];
            min = Math.min(engineers[i][1], min);
        }
        return sum * min;
    }
}

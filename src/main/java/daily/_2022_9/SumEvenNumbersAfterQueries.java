package daily._2022_9;

public class SumEvenNumbersAfterQueries {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int eSum = 0;
        for (int e : nums) if ((e & 1) == 0) eSum += e;
        int i = 0;
        int[] res = new int[nums.length];
        for (int[] e : queries) {
            int val = e[0], idx = e[1];
            int ele = nums[idx];
            if ((ele & 1) == 0) eSum -= ele;
            int sum = ele + val;
            if ((sum & 1) == 0) eSum += sum;
            nums[idx] = sum;
            res[i++] = eSum;
        }
        return res;
    }
}

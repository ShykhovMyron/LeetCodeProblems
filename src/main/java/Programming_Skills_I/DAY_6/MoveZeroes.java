package Programming_Skills_I.DAY_6;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int[] result = new int[nums.length];
        int i = 0;
        for (int num : nums) {
            if (num != 0) result[i++] = num;
        }

        System.arraycopy(result, 0, nums, 0, nums.length);
    }
}

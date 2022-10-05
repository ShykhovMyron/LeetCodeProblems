package daily._2022_9;

public class SatisfiabilityEqualityEquations {

    private final int[] nums = new int[26];

    public boolean equationsPossible(String[] equations) {
        int n = equations.length;
        for (int i = 0; i < 26; i++) nums[i] = i;
        for (String e : equations) {
            if (e.charAt(1) == '=') {
                nums[find(e.charAt(0) - 'a')] = find(e.charAt(3) - 'a');
            }
        }
        for (String e : equations) {
            if (e.charAt(1) == '!' && find(e.charAt(0) - 'a') == find(e.charAt(3) - 'a')) {
                return false;
            }
        }
        return true;
    }

    private int find(int x) {
        return nums[x] == x ? x : find(nums[x]);
    }

}

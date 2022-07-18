package easy;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int mid, left = 0, right = nums.length - 1;
        while (right >= left) {
            mid = (right + left) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}

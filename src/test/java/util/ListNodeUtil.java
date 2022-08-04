package util;

public class ListNodeUtil {
    public static ListNode createList(int[] nums) {
        if (nums == null) return null;
        ListNode head = new ListNode(nums[0]);
        ListNode current = head;
        for (int i = 1; i < nums.length; i++) {
            current.next = new ListNode(nums[i]);
            current = current.next;
        }

        return head;
    }
}

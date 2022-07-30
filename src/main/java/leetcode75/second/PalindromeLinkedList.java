package leetcode75.second;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        StringBuilder builder = new StringBuilder();
        builder.append(head.val);
        while (head.next != null) {
            head = head.next;
            builder.append(head.val);
        }
        return builder.substring(0, builder.length()/2).equals(builder.reverse().substring(0, builder.length()/2));
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

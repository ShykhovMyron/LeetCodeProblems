package leetcode75.second;

import util.ListNode;

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
}

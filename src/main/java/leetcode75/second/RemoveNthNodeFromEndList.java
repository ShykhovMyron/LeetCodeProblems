package leetcode75.second;

import util.ListNode;

public class RemoveNthNodeFromEndList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = new ListNode();
        ListNode current = fast;
        ListNode first = current;
        current.next = head;
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            current = current.next;
        }
        current.next = current.next.next;

        return first.next;
    }
}

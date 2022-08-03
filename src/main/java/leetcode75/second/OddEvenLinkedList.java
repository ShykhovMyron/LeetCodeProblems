package leetcode75.second;

import util.ListNode;

public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        ListNode white = head;
        ListNode purple = head.next, purpleHead = purple;
        while (purple != null && purple.next != null) {
            white.next = purple.next;
            white = white.next;
            purple.next = white.next;
            purple = purple.next;
        }
        white.next = purpleHead;
        return head;
    }
}

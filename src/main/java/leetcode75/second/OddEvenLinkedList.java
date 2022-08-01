package leetcode75.second;

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

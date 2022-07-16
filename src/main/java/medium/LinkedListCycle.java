package medium;

import java.util.ArrayList;
import java.util.List;

public class LinkedListCycle {
    public ListNode detectCycle(ListNode head) {
        List<ListNode> nodes = new ArrayList<>();
        while (head != null) {
            if (nodes.contains(head)) return head;
            nodes.add(head);
            head = head.next;
        }
        return null;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}

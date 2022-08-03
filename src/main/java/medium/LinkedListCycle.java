package medium;

import util.ListNode;

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
}

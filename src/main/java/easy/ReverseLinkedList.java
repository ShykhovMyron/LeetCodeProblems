package easy;

import util.ListNode;

import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        List<Integer> ints = new ArrayList<>();
        while (head != null) {
            ints.add(0, head.val);
            head = head.next;
        }
        return createList(ints);
    }

    private ListNode createList(List<Integer> ints) {
        ListNode firstNode = null;
        ListNode currentNode = null;
        for (int anInt : ints) {
            if (firstNode == null) {
                firstNode = new ListNode();
                firstNode = new ListNode();
                firstNode.val = anInt;
                currentNode = firstNode;
                continue;
            }
            currentNode.next = new ListNode();
            currentNode = currentNode.next;
            currentNode.val = anInt;
        }
        return firstNode;
    }
}

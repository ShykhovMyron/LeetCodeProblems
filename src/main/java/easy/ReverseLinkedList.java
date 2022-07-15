package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ListNode listNode = (ListNode) o;
            return val == listNode.val && Objects.equals(next, listNode.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, next);
        }
    }
}

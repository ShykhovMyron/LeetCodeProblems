package leetcode75.second;

import org.junit.jupiter.api.Test;
import util.ListNode;

class RemoveNthNodeFromEndListTest {
    private final RemoveNthNodeFromEndList removeNthNodeFromEndList = new RemoveNthNodeFromEndList();

    @Test
    void removeNthFromEndTest() {
        removeNthNodeFromEndList.removeNthFromEnd(createList(new int[]{1}), 1);
    }

    private ListNode createList(int[] nums) {
        ListNode head = new ListNode();
        ListNode current = head;
        for (int num : nums) {
            if (current.val == 0) {
                current.val = num;
                continue;
            }
            current.next = new ListNode(num);
            current = current.next;
        }

        return head;
    }
}
package leetcode75.second;

import org.junit.jupiter.api.Test;

class RemoveNthNodeFromEndListTest {
    private final RemoveNthNodeFromEndList removeNthNodeFromEndList = new RemoveNthNodeFromEndList();

    @Test
    void removeNthFromEndTest() {
        removeNthNodeFromEndList.removeNthFromEnd(createList(new int[]{1}), 1);
    }

    private RemoveNthNodeFromEndList.ListNode createList(int[] nums) {
        RemoveNthNodeFromEndList.ListNode head = new RemoveNthNodeFromEndList.ListNode();
        RemoveNthNodeFromEndList.ListNode current = head;
        for (int num : nums) {
            if (current.val == 0) {
                current.val = num;
                continue;
            }
            current.next = new RemoveNthNodeFromEndList.ListNode(num);
            current = current.next;
        }

        return head;
    }
}
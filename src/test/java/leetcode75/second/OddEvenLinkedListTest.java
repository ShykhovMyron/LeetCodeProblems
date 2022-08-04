package leetcode75.second;

import org.junit.jupiter.api.Test;
import util.ListNode;

class OddEvenLinkedListTest {
    private final OddEvenLinkedList oddEvenLinkedList = new OddEvenLinkedList();

    @Test
    void oddEvenListTest() {
        oddEvenLinkedList.oddEvenList(createList(new int[]{1, 2, 3, 4, 5}));
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
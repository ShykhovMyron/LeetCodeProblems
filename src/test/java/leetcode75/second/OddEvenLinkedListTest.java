package leetcode75.second;

import org.junit.jupiter.api.Test;

class OddEvenLinkedListTest {
    private final OddEvenLinkedList oddEvenLinkedList = new OddEvenLinkedList();

    @Test
    void oddEvenListTest() {
        oddEvenLinkedList.oddEvenList(createList(new int[]{1, 2, 3, 4, 5}));
    }

    private OddEvenLinkedList.ListNode createList(int[] nums) {
        OddEvenLinkedList.ListNode head = new OddEvenLinkedList.ListNode();
        OddEvenLinkedList.ListNode current = head;
        for (int num : nums) {
            if (current.val == 0) {
                current.val = num;
                continue;
            }
            current.next = new OddEvenLinkedList.ListNode(num);
            current = current.next;
        }

        return head;
    }
}
package leetcode75.second;

import org.junit.jupiter.api.Test;
import util.ListNode;

import static org.assertj.core.api.Assertions.assertThat;

class PalindromeLinkedListTest {
    private final PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();

    @Test
    void isPalindromeTest() {
        boolean actual = palindromeLinkedList.isPalindrome(createList(new int[]{1, 2,3, 2, 1}));
        assertThat(actual).isTrue();
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
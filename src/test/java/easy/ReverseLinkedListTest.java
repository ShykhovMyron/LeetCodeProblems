package easy;

import easy.ReverseLinkedList.ListNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseLinkedListTest {

    private final ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

    private static ListNode createList(int[] ints) {
        ListNode firstNode = new ListNode();
        ListNode currentNode = firstNode;
        for (int anInt : ints) {
            if (currentNode.val != 0) {
                currentNode.next = new ListNode();
                currentNode = currentNode.next;
            }
            currentNode.val = anInt;
        }
        return firstNode;
    }

    @Test
    void reverseListTest() {
        ListNode node = createList(new int[]{1, 2, 3, 4, 5});
        ListNode expected = createList(new int[]{1, 1, 2, 3, 4, 4});
        ListNode actual = reverseLinkedList.reverseList(node);

        assertEquals(expected, actual);
    }
}
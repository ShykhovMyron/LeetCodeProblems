package easy;

import easy.MergeTwoSortedLists.ListNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeTwoSortedListsTest {

    private final MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();

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
    void mergeTwoLists() {
        ListNode fNode = createList(new int[]{1, 2, 4});
        ListNode sNode = createList(new int[]{1, 3, 4});
        ListNode expected = createList(new int[]{1, 1, 2, 3, 4, 4});
        ListNode actual = mergeTwoSortedLists.mergeTwoLists(fNode, sNode);

        assertEquals(expected, actual);
    }
}
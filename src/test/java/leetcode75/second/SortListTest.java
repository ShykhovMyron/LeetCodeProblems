package leetcode75.second;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import util.ListNode;
import util.ListNodeUtil;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static util.ListNodeUtil.createList;

class SortListTest {
    private final SortList sortList = new SortList();

    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(createList(new int[]{4,2,1,3}), createList(new int[]{1,2,3,4})),
                Arguments.of(createList(new int[]{-1,5,3,4,0}), createList(new int[]{-1,0,3,4,5}))
        );
    }

    @ParameterizedTest
    @MethodSource("generateData")
    void sortList(ListNode head, ListNode expected) {
        ListNode actual = sortList.sortList(head);
        assertThat(actual).isEqualTo(expected);
    }
}
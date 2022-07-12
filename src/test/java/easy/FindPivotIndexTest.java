package easy;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindPivotIndexTest {
    private final FindPivotIndex fourSum = new FindPivotIndex();

    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3}, -1),
                Arguments.of(new int[]{1, 7, 3, 6, 5, 6}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("generateData")
    void pivotIndexTest(int[] nums, int expected) {
        int actual = fourSum.pivotIndex(nums);
        assertEquals(expected, actual);
    }
}
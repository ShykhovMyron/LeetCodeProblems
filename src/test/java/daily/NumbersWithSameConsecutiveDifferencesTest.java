package daily;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class NumbersWithSameConsecutiveDifferencesTest {

    final NumbersWithSameConsecutiveDifferences numbers = new NumbersWithSameConsecutiveDifferences();

    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(3, 7, new int[]{181, 292, 707, 818, 929}),
                Arguments.of(2, 1, new int[]{10, 12, 21, 23, 32, 34, 43, 45, 54, 56, 65, 67, 76, 78, 87, 89, 98})
        );
    }

    @ParameterizedTest
    @MethodSource("generateData")
    void numsSameConsecDiffTest(int n, int k, int[] expected) {
        int[] actual = numbers.numsSameConsecDiff(n, k);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
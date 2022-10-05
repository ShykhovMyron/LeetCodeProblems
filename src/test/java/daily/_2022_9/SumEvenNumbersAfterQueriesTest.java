package daily._2022_9;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SumEvenNumbersAfterQueriesTest {

    final SumEvenNumbersAfterQueries sumEvenNumbersAfterQueries = new SumEvenNumbersAfterQueries();

    static Stream<Arguments> generateData() {
        return Stream.of(
//                Arguments.of(new int[]{8,6,2,4},new int[]{1,2,3,4},new int[][]{{1,0},{-3,1},{-4,0},{2,3}}),
                Arguments.of(new int[]{2, 12}, new int[]{3, 2}, new int[][]{{4, 0}, {3, 0}})
        );
    }

    @ParameterizedTest
    @MethodSource("generateData")
    void sumEvenAfterQueries(int[] expected, int[] nums, int[][] queries) {
        int[] actual = sumEvenNumbersAfterQueries.sumEvenAfterQueries(nums, queries);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
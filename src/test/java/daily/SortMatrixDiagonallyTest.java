package daily;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SortMatrixDiagonallyTest {
  final SortMatrixDiagonally sortMatrixDiagonally = new SortMatrixDiagonally();

  static Stream<Arguments> generateData() {
    return Stream.of(
        Arguments.of(
            new int[][] {{3, 3, 1, 1}, {2, 2, 1, 2}, {1, 1, 1, 2}},
            new int[][] {{1, 1, 1, 1}, {1, 2, 2, 2}, {1, 2, 3, 3}}));
  }

  @ParameterizedTest
  @MethodSource("generateData")
  void diagonalSortTest(int[][] mat, int[][] expected) {
    int[][] actual = sortMatrixDiagonally.diagonalSort(mat);
    Assertions.assertThat(actual).isEqualTo(expected);
  }
}

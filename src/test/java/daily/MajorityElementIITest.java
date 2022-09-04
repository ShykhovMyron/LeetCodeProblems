package daily;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

class MajorityElementIITest {
  final MajorityElementII majorityElementII = new MajorityElementII();

  static Stream<Arguments> generateData() {
    return Stream.of(
        Arguments.of(
            new int[] {3, 2, 3}, List.of(3),
            new int[] {1}, List.of(1)));
  }

  @ParameterizedTest
  @MethodSource("generateData")
  void majorityElementTest(int[] nums, List<Integer> expected) {
    List<Integer> actual = majorityElementII.majorityElement(nums);
    Assertions.assertThat(actual).hasSameElementsAs(expected);
  }
}

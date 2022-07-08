package medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FourSumTest {
    private FourSum fourSum = new FourSum();
    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(new int[]{1,0,-1,0,-2,2},0,List.of(List.of(-2,-1,1,2),List.of(-2,0,0,2),List.of(-1,0,0,1))),
                Arguments.of(new int[]{2,2,2,2},8,List.of(List.of(2,2,2,2)))
        );
    }

    @ParameterizedTest
    @MethodSource("generateData")
    void getSumAbsoluteDifferencesTest(int[] nums,int target,List<List<Integer>> expected) {
        List<List<Integer>> actual = fourSum.fourSum(nums,target);
        assertEquals(expected,actual);
    }
}
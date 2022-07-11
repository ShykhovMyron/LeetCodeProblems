package medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CourseScheduleTest {

    private final CourseSchedule courseSchedule = new CourseSchedule();

    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(2, new int[][]{{1, 0}, {0, 1}}, false),
                Arguments.of(2, new int[][]{{1, 0}}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("generateData")
    void canFinish(int numCourses, int[][] prerequisites, boolean expected) {
        boolean actual = courseSchedule.canFinish(numCourses, prerequisites);
        assertEquals(expected, actual);
    }
}
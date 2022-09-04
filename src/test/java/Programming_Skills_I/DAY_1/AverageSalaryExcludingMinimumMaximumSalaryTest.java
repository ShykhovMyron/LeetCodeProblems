package Programming_Skills_I.DAY_1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class AverageSalaryExcludingMinimumMaximumSalaryTest {
    final AverageSalaryExcludingMinimumMaximumSalary salaryClass = new AverageSalaryExcludingMinimumMaximumSalary();

    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(new int[]{8000, 9000, 2000, 3000, 6000, 1000}, 4750.00000)
        );
    }

    @ParameterizedTest
    @MethodSource("generateData")
    void averageTest(int[] salary, double expected) {
        double actual = salaryClass.average(salary);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
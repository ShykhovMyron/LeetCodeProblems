package Programming_Skills_I.DAY_2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class NumberOneBitsTest {
    final NumberOneBits numberOneBits = new NumberOneBits();

    @ParameterizedTest
    @CsvSource({
            "00000000000000000000000010000000,1",
    })
    void hammingWeightTest(int n, int expected) {
        int actual = numberOneBits.hammingWeight(n);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}
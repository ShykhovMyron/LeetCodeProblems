import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringToIntegerAtoiTest {
    StringToIntegerAtoi stringToIntegerAtoi = new StringToIntegerAtoi();

    @ParameterizedTest
    @CsvSource({
            "42,42",
            "   -42,-42",
            "4193 with words,4193",
            "hello, bro -42 moneys,-42",
    })
    public void reverseTest(String  s, int expected) {
        int actual = stringToIntegerAtoi.myAtoi(s);
        assertEquals(expected, actual);
    }
}
package medium;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringToIntegerAtoiTest {
    StringToIntegerAtoi stringToIntegerAtoi = new StringToIntegerAtoi();

    @ParameterizedTest
    @CsvSource({
            "'9223372036854775808',2147483647",
            "'0a32',0",
            "'words and 987',0",
            "'-91283472332',-2147483648",
            "0032,32",
            "42,42",
            "'   -42',-42",
            "'4193 with words',4193",
            "'hello, bro -42 moneys',0",
    })
    public void reverseTest(String s, int expected) {
        int actual = stringToIntegerAtoi.myAtoi(s);
        assertEquals(expected, actual);
    }
}
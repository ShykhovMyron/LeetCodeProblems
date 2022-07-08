package medium;

/**
 * 8. String to Integer (atoi)
 * <p>
 * Medium
 * <p>
 * Share
 * Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).
 * <p>
 * The algorithm for myAtoi(string s) is as follows:
 * <p>
 * Read in and ignore any leading whitespace.
 * Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
 * Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
 * Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
 * If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
 * Return the integer as the final result.
 * Note:
 * <p>
 * Only the space character ' ' is considered a whitespace character.
 * Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "42"
 * Output: 42
 * Explanation: The underlined characters are what is read in, the caret is the current reader position.
 * Step 1: "42" (no characters read because there is no leading whitespace)
 * <p>
 * Step 2: "42" (no characters read because there is neither a '-' nor '+')
 * <p>
 * Step 3: "42" ("42" is read in)
 * <p>
 * The parsed integer is 42.
 * Since 42 is in the range [-231, 231 - 1], the final result is 42.
 * Example 2:
 * <p>
 * Input: s = "   -42"
 * Output: -42
 * Explanation:
 * Step 1: "   -42" (leading whitespace is read and ignored)
 * <p>
 * Step 2: "   -42" ('-' is read, so the result should be negative)
 * <p>
 * Step 3: "   -42" ("42" is read in)
 * <p>
 * The parsed integer is -42.
 * Since -42 is in the range [-231, 231 - 1], the final result is -42.
 * Example 3:
 * <p>
 * Input: s = "4193 with words"
 * Output: 4193
 * Explanation:
 * Step 1: "4193 with words" (no characters read because there is no leading whitespace)
 * <p>
 * Step 2: "4193 with words" (no characters read because there is neither a '-' nor '+')
 * <p>
 * Step 3: "4193 with words" ("4193" is read in; reading stops because the next character is a non-digit)
 * <p>
 * The parsed integer is 4193.
 * Since 4193 is in the range [-231, 231 - 1], the final result is 4193.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 0 <= s.length <= 200
 * s consists of English letters (lower-case and upper-case), digits (0-9), ' ', '+', '-', and '.'.
 */
public class StringToIntegerAtoi {
    public int myAtoi(String s) {
        s = s.trim();
        if (isValidString(s)) {
            return getValue(s);
        } else return 0;
    }

    private boolean isValidString(String s) {
        return s.matches("^([-+]?\\d+).*");
    }

    private int getValue(String s) {
        long result = switch (s.charAt(0)) {
            case '+' -> getNumber(s.replace("+", ""));
            case '-' -> -1 * getNumber(s.replace("-", ""));
            default -> getNumber(s);
        };
        return getValidResult(result);
    }

    private long getNumber(String s) {
        int index = 10;
        long result = 0;
        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9' && result < Integer.MAX_VALUE && result > Integer.MIN_VALUE) {
                result = result * index + Character.getNumericValue(c);
            } else break;
        }
        return result;
    }

    private int getValidResult(long result) {
        if (result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int) result;
    }
}

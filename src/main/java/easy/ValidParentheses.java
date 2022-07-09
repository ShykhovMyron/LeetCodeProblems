package easy;

/**
 * 20. Valid Parentheses
 * Easy
 * <p>
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "()"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 * <p>
 * Input: s = "(]"
 * Output: false
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        StringBuilder builder = new StringBuilder(s);
        while (!builder.isEmpty()) {
            int firstParenIndex = 0;
            int secondParenIndex = getSecondParenIndex(firstParenIndex, builder);
            if (secondParenIndex == -1) return false;
            else {
                builder.deleteCharAt(secondParenIndex);
                builder.deleteCharAt(firstParenIndex);
            }
        }
        return true;
    }

    private int getSecondParenIndex(int firstParenIndex, StringBuilder builder) {
        char firstParen = builder.charAt(firstParenIndex);
        return switch (firstParen) {
            case '(' -> builder.indexOf(")");
            case '[' -> builder.indexOf("]");
            case '{' -> builder.indexOf("}");
            default -> -1;
        };
    }
}
